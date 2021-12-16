package com.my.keepquesting.view.fragment

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayoutMediator
import com.my.keepquesting.R
import com.my.keepquesting.adpter.ViewPagerAdapter
import com.my.keepquesting.view.fragment.onBording.OnBoroadingScreenFour
import com.my.keepquesting.view.fragment.onBording.OnBoroadingScreenOne
import com.my.keepquesting.view.fragment.onBording.OnBoroadingScreenTwo
import com.my.keepquesting.view.fragment.onBording.OnBoroadingScreenthree
import kotlinx.android.synthetic.main.fragment_on_boarding_screen.*

class OnboardingScreen : Fragment(R.layout.fragment_on_boarding_screen) {


    override fun onResume() {
        super.onResume()
        val screens= listOf<Fragment>(OnBoroadingScreenOne(),OnBoroadingScreenTwo(),OnBoroadingScreenthree(),OnBoroadingScreenFour())

        val adapter=ViewPagerAdapter(requireActivity().supportFragmentManager
            ,lifecycle,screens)



        theMainViewPager.adapter=adapter

        TabLayoutMediator(into_tab_layout, theMainViewPager)
        { tab, position ->}.attach()

        theMainViewPager.registerOnPageChangeCallback(object: ViewPager2.OnPageChangeCallback() {
            override fun onPageScrolled(
                position: Int,
                positionOffset: Float,
                positionOffsetPixels: Int
            ) {
                super.onPageScrolled(position, positionOffset, positionOffsetPixels)


            }

            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)

                if (position==screens.lastIndex){
                    skipButton.text="Lets’ go!"
                    skipButton.setBackgroundColor(resources.getColor(R.color.blue));
                }else{
                    skipButton.text="Skip"
                    skipButton.setBackgroundColor(resources.getColor(R.color.pink));


                }

            }

            override fun onPageScrollStateChanged(state: Int) {
                super.onPageScrollStateChanged(state)

            }
        })




        skipButton.setOnClickListener {
            findNavController().navigate(R.id.action_onboardingScreen_to_startScreen)
        }
    }





}