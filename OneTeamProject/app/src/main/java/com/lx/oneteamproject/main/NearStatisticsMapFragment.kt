package com.lx.oneteamproject.main

import android.content.Context
import android.location.Geocoder
import android.os.Bundle
import android.os.Looper
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import com.google.android.gms.location.FusedLocationProviderClient
import com.google.android.gms.location.LocationCallback
import com.google.android.gms.location.LocationRequest
import com.google.android.gms.location.LocationResult
import com.google.android.gms.location.LocationServices
import com.lx.oneteamproject.databinding.NearStatiticsMapFragmentBinding
import com.lx.oneteamproject.fragment.FragmentType
import com.lx.oneteamproject.fragment.OnFragmentListener
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import java.util.Locale


class NearStatisticsMapFragment : Fragment() {

    private var _binding: NearStatiticsMapFragmentBinding? = null
    private val binding get() = _binding!!

    var listener: OnFragmentListener? = null

    var locationclient: FusedLocationProviderClient? = null

    private fun replaceFragment(fragment: Fragment, transaction: FragmentTransaction) {
        transaction.replace(com.lx.oneteamproject.R.id.NearStatiticsFragmentMap, fragment)
            .addToBackStack(null)
            .commit()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is OnFragmentListener) {
            listener = context
        } else {
            throw RuntimeException("$context must implement OnFragmentListener")
        }
    }

    override fun onDetach() {
        super.onDetach()
        listener = null
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = NearStatiticsMapFragmentBinding.inflate(inflater, container, false)

        requestLocation2()

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val btnSocial = binding.root.findViewById<ImageView>(com.lx.oneteamproject.R.id.statisticsSocial)
        val btnRisk = binding.root.findViewById<ImageView>(com.lx.oneteamproject.R.id.statisticsRisk)
        val btnNatural = binding.root.findViewById<ImageView>(com.lx.oneteamproject.R.id.statisticsNatural)
        val btnSafety = binding.root.findViewById<ImageView>(com.lx.oneteamproject.R.id.statisticsSafety)

        btnSocial.setOnClickListener {
            replaceFragment(NearSocialdisterFragment(), childFragmentManager.beginTransaction())
        }
        btnRisk.setOnClickListener {
            replaceFragment(NearRiskInformationFragment(), childFragmentManager.beginTransaction())
        }
        btnNatural.setOnClickListener {
            replaceFragment(NearNaturalDisaterFragment(), childFragmentManager.beginTransaction())
        }
        btnSafety.setOnClickListener {
            replaceFragment(
                NearSafetyFacilityInfoormationFragment(),
                childFragmentManager.beginTransaction()
            )
        }
    }

    override fun onResume() {
        super.onResume()

        val btnSocial = binding.root.findViewById<ImageView>(com.lx.oneteamproject.R.id.statisticsSocial)
        val btnRisk = binding.root.findViewById<ImageView>(com.lx.oneteamproject.R.id.statisticsRisk)
        val btnNatural = binding.root.findViewById<ImageView>(com.lx.oneteamproject.R.id.statisticsNatural)
        val btnSafety = binding.root.findViewById<ImageView>(com.lx.oneteamproject.R.id.statisticsSafety)

        val selectedButton = arguments?.getString("selectedButton")
        Log.d("SelectedButton", "Button: $selectedButton")
        when (selectedButton) {
            "social" -> {
                Log.d("SelectedButton", "Social button is clicked.")
                btnSocial.performClick()
            }

            "risk" -> {
                Log.d("SelectedButton", "Risk button is clicked.")
                btnRisk.performClick()
            }

            "natural" -> {
                Log.d("SelectedButton", "Natural button is clicked.")
                btnNatural.performClick()
            }

            "safety" -> {
                Log.d("SelectedButton", "Safety button is clicked.")
                btnSafety.performClick()
            }

        }

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

}
