package com.lx.oneteamproject.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.animation.AnimationUtils
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

        val slideInAnimation = AnimationUtils.loadAnimation(this, R.anim.start)

        binding.viewGroup.startAnimation(slideInAnimation)

        // 다른 TextView에도 동일하게 애니메이션을 적용하려면 아래 코드를 추가합니다.
        // binding.다른TextView.startAnimation(slideInAnimation)

        Handler().postDelayed({
            val intent = Intent(this@StartActivity, LoginActivity::class.java)
            startActivity(intent)
            //overridePendingTransition(R.anim.start, 0)
            finish()
        }, DELAY_TIME_MS)
    }


}