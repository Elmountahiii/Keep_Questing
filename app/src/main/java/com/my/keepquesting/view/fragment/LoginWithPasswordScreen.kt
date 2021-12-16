package com.my.keepquesting.view.fragment

import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

import com.my.keepquesting.R
import kotlinx.android.synthetic.main.fragment_login_with_password_screen.*

class LoginWithPasswordScreen : Fragment(R.layout.fragment_login_with_password_screen) {


    override fun onResume() {
        super.onResume()

        textView3.setOnClickListener {

            findNavController().navigate(R.id.action_loginWithPasswordScreen_to_logInWithIdScreen)
        }

        loginButton.setOnClickListener {

            findNavController().navigate(R.id.action_loginWithPasswordScreen_to_startPageScreen)
        }
    }

}