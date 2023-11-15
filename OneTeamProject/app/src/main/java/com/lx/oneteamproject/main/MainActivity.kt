package com.lx.oneteamproject.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.fragment.app.Fragment
import com.lx.oneteamproject.R
import com.lx.oneteamproject.databinding.ActivityMainBinding
import com.lx.oneteamproject.fragment.FragmentType
import com.lx.oneteamproject.fragment.OnFragmentListener


class MainActivity : AppCompatActivity(), OnFragmentListener {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // 화면 첫 시작 되는 fragment 호출
        onFragmentChanged(FragmentType.MAIN)

    }

    // 각 fragment 설정
    override fun onFragmentChanged(type: FragmentType) {
        val fragment: Fragment
        val bundle = Bundle()

        when (type) {
            FragmentType.MAIN -> {
                fragment = MainFragment()
            }

            FragmentType.NEARSITUATIONMAP -> {
                fragment = NearSituationMapFragment()
            }

            FragmentType.NEARSTATISTICSMAP -> {
                fragment = NearStatisticsMapFragment()
            }

            FragmentType.NEARSTATISTICSMAP_SOCIAL -> {
                fragment = NearStatisticsMapFragment()
                bundle.putString("selectedButton", "social")
            }

            FragmentType.NEARSTATISTICSMAP_RISK -> {
                fragment = NearStatisticsMapFragment()
                bundle.putString("selectedButton", "risk")
            }

            FragmentType.NEARSTATISTICSMAP_NATURAL -> {
                fragment = NearStatisticsMapFragment()
                bundle.putString("selectedButton", "natural")
            }

            FragmentType.NEARSTATISTICSMAP_SAFETY -> {
                fragment = NearStatisticsMapFragment()
                bundle.putString("selectedButton", "safety")
            }

            FragmentType.REPORTDETAILS -> {
                fragment = ReportDetailsFragment()
            }



            // 여기에 각자가 만든 fragment를 연결시켜주면 돼 !!
            // fragmentType 클래스에 정의 해놓은 이름은 fragment 이름과 동일하게 했어

            else -> {
                return
            }
        }

        fragment.arguments = bundle
        supportFragmentManager.beginTransaction().replace(R.id.mainFragmentContainer, fragment)
            .commit()
    }

}

