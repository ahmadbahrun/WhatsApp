package com.example.whatsapp.landigpage

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.whatsapp.model.Calls
import com.example.whatsapp.model.Chats
import com.example.whatsapp.model.Status

class AppPagerAdapter(fragmentActivity : FragmentActivity) : FragmentStateAdapter(fragmentActivity){
    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0 -> Chats()
            1 -> Status()
            2 -> Calls()
            else -> Chats()
        }
    }
}