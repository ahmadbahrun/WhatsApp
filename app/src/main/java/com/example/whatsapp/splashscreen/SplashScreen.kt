package com.example.whatsapp.splashscreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.whatsapp.MainActivity
import com.example.whatsapp.R
import com.example.whatsapp.databinding.ActivitySplashScreenBinding
import com.example.whatsapp.landigpage.LandingPageActivity

class SplashScreen : AppCompatActivity() {

    private lateinit var binding: ActivitySplashScreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivitySplashScreenBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        supportActionBar?.hide()
        Handler().postDelayed({
            val intent = Intent(this@SplashScreen,LandingPageActivity::class.java)
            startActivity(intent)
            finish()
        },3000)
    }
}