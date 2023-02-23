package com.example.whatsapp.landigpage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.whatsapp.R

class LandingPageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_landing_page)

        supportActionBar?.hide()
    }
}