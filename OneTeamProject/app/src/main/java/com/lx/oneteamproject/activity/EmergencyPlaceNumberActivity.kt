package com.lx.oneteamproject.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.lx.oneteamproject.R
import com.lx.oneteamproject.databinding.ActivityEmergencyPlaceNumberBinding
import com.lx.oneteamproject.databinding.ActivityLoginBinding
import com.lx.oneteamproject.databinding.ActivityMainBinding
import com.lx.oneteamproject.popup.CustomDialog
import com.lx.oneteamproject.popup.CustomerDialogInterface

class EmergencyPlaceNumberActivity : AppCompatActivity(), CustomerDialogInterface {

    lateinit var binding: ActivityEmergencyPlaceNumberBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEmergencyPlaceNumberBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val customDialog = CustomDialog(this, this)

        binding.policeButton.setOnClickListener {
            customDialog.show()
        }



    }

    override fun onAddButtonClicked() {
        Toast.makeText(this, "신고", Toast.LENGTH_SHORT).show()    }


}