package com.example.botoomnavigationfluid

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class HomePagerAdapter(fragmentManager: FragmentManager) :
    FragmentPagerAdapter(fragmentManager) {
    override fun getItem(position: Int): Fragment {
        var fragment: Fragment? = null
        when (position) {
            0 -> fragment = RentalsFragment()
            1 -> fragment = RentalsFragment()
            2 -> fragment = RentalsFragment()
            3 -> fragment = RentalsFragment()
            4 -> fragment = RentalsFragment()
        }
        return fragment!!
    }

    override fun getCount(): Int {
        return 5
    }


}