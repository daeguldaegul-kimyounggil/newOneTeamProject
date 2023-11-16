package com.lx.oneteamproject.main

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
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
    @SuppressLint("SuspiciousIndentation")
    override fun onFragmentChanged(type: FragmentType) {val fragment: Fragment
    val bundle = Bundle()

        when (type) {
            FragmentType.MAIN -> {
                supportFragmentManager.beginTransaction().replace(R.id.mainFragmentContainer, MainFragment()).commit()
            }

            FragmentType.REPORT -> {
                supportFragmentManager.beginTransaction().replace(R.id.mainFragmentContainer, MainReportFragment()).commit()
            }

            FragmentType.REPORTCHECK -> {
                supportFragmentManager.beginTransaction().replace(R.id.mainFragmentContainer, ReportCheckPopUpFragment()).commit()
            }

            FragmentType.REPORTFREE -> {
                supportFragmentManager.beginTransaction().replace(R.id.mainReportContainer, MainReportFreeFragment()).commit()
            }

            FragmentType.REPORTFORM -> {
                supportFragmentManager.beginTransaction().replace(R.id.mainReportContainer, MainReportFormFragment()).commit()
            }

            else -> {
                return
            }
        }

    }

}

