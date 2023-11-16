package com.lx.oneteamproject.main

import android.Manifest
import android.content.Context
import android.content.pm.PackageManager
import android.location.Geocoder
import android.location.Location
import android.os.Bundle
import android.os.Looper
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import com.google.android.gms.location.FusedLocationProviderClient
import com.google.android.gms.location.LocationCallback
import com.google.android.gms.location.LocationRequest
import com.google.android.gms.location.LocationResult
import com.google.android.gms.location.LocationServices
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.lx.oneteamproject.R
import com.lx.oneteamproject.databinding.NearSituationMapFragmentBinding // import 추가
import com.lx.oneteamproject.fragment.OnFragmentListener
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import java.util.Locale

class NearSituationMapFragment : Fragment() {

    private var _binding: NearSituationMapFragmentBinding? = null
    private val binding get() = _binding!!

    private lateinit var map: GoogleMap

    var listener: OnFragmentListener? = null

    var locationclient: FusedLocationProviderClient? = null

    companion object {
        private const val LOCATION_PERMISSION_REQUEST_CODE = 1001
        private const val DEFAULT_ZOOM = 15f
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is OnFragmentListener) {
            listener = context
        } else {
            throw RuntimeException("$context must implement OnFragmentListener")
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = NearSituationMapFragmentBinding.inflate(inflater, container, false)
        val rootView = binding.root

        initMap()

        requestLocation2()

        return rootView
    }

    private fun initMap() {
        val mapFragment =
            childFragmentManager.findFragmentById(R.id.NearSiuationFragmentMap) as SupportMapFragment
        mapFragment.getMapAsync { googleMap ->
            map = googleMap
            requestLocation()
        }
    }

    private fun requestLocation() {
        if (ContextCompat.checkSelfPermission(
                requireContext(),
                Manifest.permission.ACCESS_FINE_LOCATION
            ) == PackageManager.PERMISSION_GRANTED
        ) {
            // 이미 권한이 부여되었을 경우 작업 수행
            getLocation()
        } else {
            // 권한이 부여되지 않았을 경우 사용자에게 요청
            requestLocationPermission()
        }
    }

    private fun requestLocationPermission() {
        requestPermissions(
            arrayOf(Manifest.permission.ACCESS_FINE_LOCATION),
            LOCATION_PERMISSION_REQUEST_CODE
        )
    }

    // 권한 요청 결과를 처리
    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<String>,
        grantResults: IntArray
    ) {
        when (requestCode) {
            LOCATION_PERMISSION_REQUEST_CODE -> {
                if (grantResults.isNotEmpty() && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    // 권한이 부여되었을 경우 작업 수행
                    getLocation()
                } else {
                    // 권한이 거부되었을 경우 적절히 처리 (예: 사용자에게 메시지 표시)
                    Toast.makeText(
                        requireContext(),
                        "위치 권한이 거부되었습니다. 일부 기능이 작동하지 않을 수 있습니다.",
                        Toast.LENGTH_SHORT
                    ).show()
                }
            }
        }
    }

    private fun getLocation() {
        locationclient = LocationServices.getFusedLocationProviderClient(requireContext())

        if (ContextCompat.checkSelfPermission(
                requireContext(),
                Manifest.permission.ACCESS_FINE_LOCATION
            ) == PackageManager.PERMISSION_GRANTED
        ) {
            locationclient?.lastLocation?.addOnSuccessListener { location ->
                if (location != null) {
                    // 위치를 가져와서 지도를 해당 위치로 이동
                    moveCameraToLocation(location)
                }
            }
        } else {
            // 위치 권한이 없을 경우 권한 요청
            requestLocationPermission()
        }
    }

    private fun moveCameraToLocation(location: Location) {
        val currentLatLng = LatLng(location.latitude, location.longitude)
        map.moveCamera(CameraUpdateFactory.newLatLngZoom(currentLatLng, DEFAULT_ZOOM))
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
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
                            if (isAdded) { // Fragment가 Context에 연결되어 있는지 확인합니다.
                                val address = getAddress(location.latitude, location.longitude)
                                binding.mainLocation?.text = address ?: "주소를 찾을 수 없습니다."
                            }
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
