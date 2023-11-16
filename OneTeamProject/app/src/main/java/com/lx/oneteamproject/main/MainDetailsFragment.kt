package com.lx.oneteamproject.main

import android.app.Activity
import android.content.Intent
import android.location.Geocoder
import android.os.Bundle
import android.os.Looper
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.core.content.ContentProviderCompat
import androidx.fragment.app.Fragment
import com.google.android.gms.location.FusedLocationProviderClient
import com.google.android.gms.location.LocationCallback
import com.google.android.gms.location.LocationRequest
import com.google.android.gms.location.LocationResult
import com.google.android.gms.location.LocationServices
import com.lx.oneteamproject.databinding.FragmentMainDetailsBinding
import com.lx.oneteamproject.fragment.FragmentType
import com.lx.oneteamproject.fragment.OnFragmentListener
import com.lx.oneteamproject.sub.SubActivity
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import java.util.Locale

class MainDetailsFragment : Fragment() {

    var _binding: FragmentMainDetailsBinding? = null
    val binding get() = _binding!!

    var listener: OnFragmentListener? = null

    var locationclient: FusedLocationProviderClient? = null

    override fun onAttach(activity: Activity) {
        super.onAttach(activity)

        if (activity is OnFragmentListener) {
            listener = activity as OnFragmentListener
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentMainDetailsBinding.inflate(inflater, container, false)

        // 국민행동요령 pager adapter 연결하는 부분
        binding.mainActionArticlePager.adapter =
            MainActionArticlePagerAdapter(requireActivity().supportFragmentManager, lifecycle)

        // 신고하기 눌렀을 때
        binding.mainReportButton.setOnClickListener {
            listener?.onFragmentChanged(FragmentType.REPORT)
        }

        binding.myLetterBox.setOnClickListener {
            val intent = Intent(requireContext(), SubActivity::class.java).apply {
                putExtra("fragmentType", FragmentType.MYREPORTLIST.name)
            }
            startActivity(intent)
        }

        binding.situationButton.setOnClickListener {
            val intent = Intent(requireContext(), SubActivity::class.java).apply {
                putExtra("fragmentType", FragmentType.NEARSITUATIONMAP.name)
            }
            startActivity(intent)
        }



        binding.socialButton.setOnClickListener {
            val intent = Intent(requireContext(), SubActivity::class.java).apply {
                putExtra("fragmentType", FragmentType.NEARSTATISTICSMAP_SOCIAL.name)
            }
            startActivity(intent)
        }

        binding.riskButton.setOnClickListener {
            val intent = Intent(requireContext(), SubActivity::class.java).apply {
                putExtra("fragmentType", FragmentType.NEARSTATISTICSMAP_RISK.name)
            }
            startActivity(intent)
        }

        binding.naturalButton.setOnClickListener {
            val intent = Intent(requireContext(), SubActivity::class.java).apply {
                putExtra("fragmentType", FragmentType.NEARSTATISTICSMAP_NATURAL.name)
            }
            startActivity(intent)
        }

        binding.safetyButton.setOnClickListener {
            val intent = Intent(requireContext(), SubActivity::class.java).apply {
                putExtra("fragmentType", FragmentType.NEARSTATISTICSMAP_SAFETY.name)
            }
            startActivity(intent)
        }


        requestLocation2()

        return binding.root
    }

    fun requestLocation2() {
        // 위치 클라이언트 만들기
        locationclient = LocationServices.getFusedLocationProviderClient(requireContext())

        try {
            // 내 현재 위치 요청하기
            val locationRequest = LocationRequest.create()
            locationRequest.priority = LocationRequest.PRIORITY_HIGH_ACCURACY
            locationRequest.interval = 30 * 1000

            val locationCallback = object : LocationCallback() {
                // 제너레이트 오버라이드 메소드
                override fun onLocationResult(result: LocationResult) {
                    super.onLocationResult(result)

                    GlobalScope.launch(Dispatchers.Main) {
                        for ((index, location) in result.locations.withIndex()) {
                            val address = getAddress(location.latitude, location.longitude)
                             binding.mainLocation.text = address ?: "주소를 찾을 수 없습니다."
                        }
                    }

                }
            }
            // 위치 업데이트를 요청 하는 것
            locationclient?.requestLocationUpdates(
                locationRequest,
                locationCallback,
                Looper.myLooper()
            )

        } catch (e: SecurityException) {
            e.printStackTrace()
        }
    }


    fun getAddress(latitude: Double, longitude: Double): String? {
        val geocoder = Geocoder(requireContext(), Locale.KOREAN)
        val addresses = geocoder.getFromLocation(latitude, longitude, 1)
        val address = addresses?.getOrNull(0)?.getAddressLine(0)
        return address?.replace("대한민국 ", "")?.replace("KR", "")?.replace("서울특별시", "")?.trim()
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun onDetach() {
        super.onDetach()

        listener = null
    }
}