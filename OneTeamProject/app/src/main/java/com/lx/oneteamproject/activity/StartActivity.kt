package com.lx.oneteamproject.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.lx.oneteamproject.R
import com.lx.oneteamproject.databinding.ActivityStartBinding

class StartActivity : AppCompatActivity() {
    lateinit var binding: ActivityStartBinding

    // start 화면에서 2초 머물러 있다가 login 화면으로 이동되게 하기 위한 코드
    private val DELAY_TIME_MS: Long = 2000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityStartBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // 화면이 전환되는 부분
        Handler().postDelayed({
            val intent = Intent(this@StartActivity, LoginActivity::class.java)
            startActivity(intent)
            finish()
        }, DELAY_TIME_MS)
    }

}