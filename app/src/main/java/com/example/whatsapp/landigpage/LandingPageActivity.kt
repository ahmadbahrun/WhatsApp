package com.example.whatsapp.landigpage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toolbar
import androidx.viewpager2.widget.ViewPager2
import com.example.whatsapp.R
import com.example.whatsapp.databinding.ActivityLandingPageBinding
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class LandingPageActivity : AppCompatActivity() {

    private lateinit var binding : ActivityLandingPageBinding
    private lateinit var viewPager2 : ViewPager2
    private lateinit var tabLayout: TabLayout
    private lateinit var toolbar : androidx.appcompat.widget.Toolbar
    private lateinit var appPagerAdapter: AppPagerAdapter
    private val titles = arrayListOf("Chats","Status","Calls")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLandingPageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        toolbar = binding.toolbar
        tabLayout = binding.tablayout
        viewPager2 = binding.vp2
        toolbar.title = "WhatsApp"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        setSupportActionBar(toolbar)
        appPagerAdapter = AppPagerAdapter(this)
        viewPager2.adapter = appPagerAdapter
        TabLayoutMediator(tabLayout,viewPager2){
            tab,position ->
            tab.text = titles[position]
        }.attach()
    }
}