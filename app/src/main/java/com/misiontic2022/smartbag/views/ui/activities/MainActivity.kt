package com.misiontic2022.smartbag.views.ui.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.misiontic2022.smartbag.R
import com.misiontic2022.smartbag.databinding.ActivityMainBinding
import kotlinx.coroutines.delay

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var handler: Handler

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //Asociar el activity a un layout
        //setContentView(R.layout.activity_main)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //configuracion para que la animacion funcione
        //binding.animationView.setAnimation(R.raw.canasta)
        binding.animationView.playAnimation()
        //Trancision entre animacion y la siguiente activity (4s)
        handler= Handler(Looper.getMainLooper()!!)
        handler.postDelayed({
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            finish()
        },4000)
    }
}