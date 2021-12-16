package com.my.keepquesting.view.fragment

import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

import com.my.keepquesting.R
import kotlinx.android.synthetic.main.fragment_log_in_with_id_screen.*


class LogInWithIdScreen : Fragment(R.layout.fragment_log_in_with_id_screen) {


    override fun onResume() {
        super.onResume()
        textView3.setOnClickListener {

            findNavController().navigate(R.id.action_logInWithIdScreen_to_loginWithPasswordScreen)

        }

        imageView2.setOnClickListener {
            findNavController().navigate(R.id.action_logInWithIdScreen_to_startPageScreen)


        }


    }

}