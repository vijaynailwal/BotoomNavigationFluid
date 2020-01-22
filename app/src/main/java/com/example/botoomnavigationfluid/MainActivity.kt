package com.example.botoomnavigationfluid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import androidx.viewpager.widget.ViewPager
import com.tenclouds.fluidbottomnavigation.FluidBottomNavigationItem
import com.tenclouds.fluidbottomnavigation.listener.OnTabSelectedListener
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setBottomNavigation()

    }


    private fun setBottomNavigation() {
        fluidBottomNavigation.items =
            listOf(
                FluidBottomNavigationItem(
                    getString(R.string.rentals),
                    ContextCompat.getDrawable(this, R.drawable.ic_launcher_background)
                ),
                FluidBottomNavigationItem(
                    getString(R.string.flip),
                    ContextCompat.getDrawable(this, R.drawable.ic_launcher_background)
                ),
                FluidBottomNavigationItem(
                    getString(R.string.add),
                    ContextCompat.getDrawable(this, R.drawable.ic_launcher_background)
                ),
                FluidBottomNavigationItem(
                    getString(R.string.search),
                    ContextCompat.getDrawable(this, R.drawable.ic_launcher_background)
                ),
                FluidBottomNavigationItem(
                    getString(R.string.more),
                    ContextCompat.getDrawable(this, R.drawable.ic_launcher_background)
                )
            )

        viewpager.setAdapter(HomePagerAdapter(supportFragmentManager))
        viewpager.addOnPageChangeListener(object : ViewPager.OnPageChangeListener {
            override fun onPageScrollStateChanged(state: Int) {}

            override fun onPageScrolled(
                position: Int,
                positionOffset: Float, positionOffsetPixels: Int
            ) {
            }

            override fun onPageSelected(position: Int) {
                fluidBottomNavigation.selectTab(position)
            }
        })

        fluidBottomNavigation.onTabSelectedListener = object : OnTabSelectedListener {
            override fun onTabSelected(position: Int) {
                viewpager.setCurrentItem(position)
            }
        }
    }

}
