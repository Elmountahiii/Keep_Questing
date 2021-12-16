package com.my.keepquesting.view.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.my.keepquesting.R
import kotlinx.android.synthetic.main.fragment_registration_screen.*


class RegistrationScreen : Fragment(R.layout.fragment_registration_screen) {

    override fun onResume() {
        super.onResume()
        registrationButton.setOnClickListener {

            findNavController().navigate(R.id.action_registrationScreen_to_startPageScreen)
        }

        textView3.setOnClickListener {

            findNavController().navigate(R.id.action_registrationScreen_to_logInWithIdScreen)

        }
    }

}