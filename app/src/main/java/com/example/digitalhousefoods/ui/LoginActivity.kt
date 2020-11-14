package com.example.digitalhousefoods.ui

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.digitalhousefoods.R
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.AppTheme)
        supportActionBar
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        btnLogin.setOnClickListener {
            callMain()
        }

        btnRegister.setOnClickListener {
            callCadastro()
        }

    }

    private fun callMain(){
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        }

    private fun callCadastro(){
        val intent = Intent(this, RegisterActivity::class.java)
        startActivity(intent)
    }
}