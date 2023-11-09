package com.example.projectmobile1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import com.example.projectmobile1.databinding.ActivityLoginBinding
import android.widget.Button
import android.widget.EditText


class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding
    private lateinit var editTextEmail: EditText
    private lateinit var editTextPassword: EditText
    private lateinit var buttonLogin: Button
//    private lateinit var buttonBackL: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        editTextEmail = binding.editTextTextPersonName
        editTextPassword = binding.editTextPassword
        buttonLogin = binding.buttonLogin
//        buttonBackL = binding.buttonBackL

        buttonLogin.setOnClickListener {
            val email = editTextEmail.text.toString()
            val password = editTextPassword.text.toString()

            // Gantilah dengan validasi login yang sesuai
            if (email == "putri@gmail.com" && password == "1234") {

                // Login berhasil, pindah ke MainActivity2
                val intent = Intent(this, MainActivity2::class.java)
                startActivity(intent)
            } else {
                // Login gagal, tampilkan pesan kesalahan atau tindakan yang sesuai
            }
        }

//        buttonBackL.setOnClickListener {
//            // Handle the button click event here
//            val intent = Intent(this, MainActivity::class.java)
//            startActivity(intent)
//        }
    }
}