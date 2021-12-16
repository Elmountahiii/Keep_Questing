package com.my.keepquesting.view.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.my.keepquesting.R
import com.my.keepquesting.view.activity.MainActivity

import android.content.Intent
import android.os.Handler
import androidx.navigation.fragment.findNavController


class SplashScreen : Fragment(R.layout.fragment_splash_screen) {


    override fun onResume() {
        super.onResume()

        Handler().postDelayed(Runnable { //This method will be executed once the timer is over
           findNavController().navigate(R.id.action_splashScreen_to_onboardingScreen)
        }, 1500)
    }

}