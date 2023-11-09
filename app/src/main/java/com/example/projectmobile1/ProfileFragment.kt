package com.example.projectmobile1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.projectmobile1.databinding.FragmentProfileBinding

class ProfileFragment : Fragment() {

    private lateinit var binding: FragmentProfileBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentProfileBinding.inflate(inflater, container, false)
        val view = binding.root

        // Check if the login credentials are valid
        val email = "putri@gmail.com"
        val password = "1234"

        if (email == "putri@gmail.com" && password == "1234") {
            // If the credentials are valid, update the textNamaProfile and textEmail
            val textNamaProfile = binding.textNamaProfile
            val textEmail = binding.textEmail

            textNamaProfile.text = "Putri Jannatiningtias"
            textEmail.text = "putri@gmail.com"
        }

        return view
    }

}