package com.misiontic2022.smartbag.views.ui.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.misiontic2022.smartbag.databinding.ActivityMainBinding

class LoginActivity: AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}