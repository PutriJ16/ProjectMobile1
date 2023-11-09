package com.example.projectmobile1

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    private var loginButton: Button? = null
    private var signUpButton: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loginButton = findViewById<View>(R.id.buttonL) as Button
        signUpButton = findViewById<View>(R.id.buttonS) as Button

        // Menambahkan listener untuk tombol Login
        loginButton!!.setOnClickListener(View.OnClickListener { openLoginActivty() })

        // Menambahkan listener untuk tombol Login
        signUpButton!!.setOnClickListener(View.OnClickListener { openSignUpActivty() })
    }

    fun openLoginActivty() {
        // Pindah ke activity Login
        val intent = Intent(this, LoginActivity::class.java)
        startActivity(intent)
    }

    fun openSignUpActivty() {
        // Pindah ke activity SignUp
        val intent = Intent(this, RegisterActivity::class.java)
        startActivity(intent)
    }
}