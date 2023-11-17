package com.lx.oneteamproject.main

import android.annotation.SuppressLint
import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.widget.Button
import android.widget.CheckBox
import androidx.appcompat.app.AlertDialog
import androidx.core.view.GravityCompat
import androidx.fragment.app.Fragment
import com.lx.oneteamproject.R
import com.lx.oneteamproject.databinding.ActivityMainBinding
import com.lx.oneteamproject.fragment.FragmentType
import com.lx.oneteamproject.fragment.OnFragmentListener
import androidx.drawerlayout.widget.DrawerLayout
import java.text.SimpleDateFormat
import java.util.Locale


class MainActivity : AppCompatActivity(), OnFragmentListener {

    lateinit var binding: ActivityMainBinding
    lateinit var sharedPreferences: SharedPreferences

    companion object {
        private const val MAIN_POPUP_STATE_KEY = "main_popup_state"
        private const val LAST_POPUP_TIME_KEY = "last_popup_time"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // SharedPreferences 초기화
        sharedPreferences = getPreferences(Context.MODE_PRIVATE)

        // 저장된 시간 가져오기
        val lastPopupTime = sharedPreferences.getLong(LAST_POPUP_TIME_KEY, 0)

        // mainPopupCheckBox의 상태에 따라 팝업 표시 여부 결정
        val shouldShowPopup = !sharedPreferences.getBoolean(MAIN_POPUP_STATE_KEY, false) ||
                (sharedPreferences.getBoolean(MAIN_POPUP_STATE_KEY, false) &&
                        System.currentTimeMillis() - lastPopupTime >= 24 * 60 * 60 * 1000)

        val dateFormat = SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault())
        val formattedDate = dateFormat.format(lastPopupTime)

        Log.d("팝업 24시간 안뜨게 한 시간", formattedDate)


        if (!isFinishing && shouldShowPopup) {
            showPopup()
        }

        // 화면 첫 시작 되는 fragment 호출
        onFragmentChanged(FragmentType.MAIN)

        val drawerLayout = findViewById<DrawerLayout>(R.id.drawer_layout)

        // 설정 아이콘 눌렀을 때 햄버거
        binding.mainSettingsButton.setOnClickListener {
            if (drawerLayout.isDrawerOpen(GravityCompat.END)) {
                drawerLayout.closeDrawer(GravityCompat.END)
            } else {
                drawerLayout.openDrawer(GravityCompat.END)
            }
            true
        }

    }

    private fun showPopup() {
        val popUpView = LayoutInflater.from(this).inflate(R.layout.manual_main, null)
        val popUpBuilder = AlertDialog.Builder(this, R.style.FullScreenDialogStyle)
            .setView(popUpView)

        val popUpDialog = popUpBuilder.show()

        val closeButton = popUpView.findViewById<Button>(R.id.closeButton)
        val checkBox = popUpView.findViewById<CheckBox>(R.id.mainPopupCheckBox)

        closeButton.setOnClickListener {
            // 팝업이 닫힐 때 상태 저장
            savePopupState(checkBox.isChecked)
            savePopupTime()

            popUpDialog.dismiss()
        }
    }


    private fun savePopupState(isChecked: Boolean) {
        Log.d("PopupTest", "savePopupState - isChecked: $isChecked")
        val editor = sharedPreferences.edit()
        editor.putBoolean(MAIN_POPUP_STATE_KEY, isChecked)
        editor.apply()
    }

    private fun savePopupTime() {
        val editor = sharedPreferences.edit()
        editor.putLong(LAST_POPUP_TIME_KEY, System.currentTimeMillis())
        editor.apply()
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
