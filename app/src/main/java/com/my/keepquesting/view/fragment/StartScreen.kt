package com.my.keepquesting.view.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.my.keepquesting.R
import kotlinx.android.synthetic.main.fragment_start_screen.*


class StartScreen : Fragment(R.layout.fragment_start_screen) {

    override fun onResume() {
        super.onResume()
        registrationButton.setOnClickListener {

            findNavController().navigate(R.id.action_startScreen_to_registrationScreen)
        }


        loginButton.setOnClickListener {

            findNavController().navigate(R.id.action_startScreen_to_loginWithPasswordScreen)


        }
    }

}