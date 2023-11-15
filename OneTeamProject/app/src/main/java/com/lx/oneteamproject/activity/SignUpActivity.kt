package com.lx.oneteamproject.activity

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.lx.oneteamproject.databinding.ActivitySignupBinding

class SignUpActivity : AppCompatActivity() {
    lateinit var binding: ActivitySignupBinding
    lateinit var checkBox1: CheckBox
    lateinit var checkBox2: CheckBox
    lateinit var signUpButton: Button

    var checkBox1Checked = false
    var checkBox2Checked = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignupBinding.inflate(layoutInflater)
        setContentView(binding.root)

        checkBox1 = binding.checkbok1
        checkBox2 = binding.checkbok2
        signUpButton = binding.signUpPageButton

        checkBox1.setOnCheckedChangeListener { _, isChecked ->
            checkBox1Checked = isChecked
        }

        checkBox2.setOnCheckedChangeListener { _, isChecked ->
            checkBox2Checked = isChecked
        }

        signUpButton.setOnClickListener {
            checkAgreementAndSignUp()
        }

        binding.textView34.setOnClickListener {
            val signupPageIntent = Intent(this@SignUpActivity, StartActivity::class.java)
            startActivity(signupPageIntent)
            finish()
        }
    }

    private fun checkAgreementAndSignUp() {
        if (checkBox1Checked && checkBox2Checked) {
            // 체크박스1과 체크박스2가 모두 체크되어 있을 때 회원가입 완료 처리
            showToast("회원가입이 완료되었습니다.")
            // 여기에 회원가입에 필요한 코드를 추가
        } else {
            showToast("약관에 동의해주세요")
        }
    }

    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}
