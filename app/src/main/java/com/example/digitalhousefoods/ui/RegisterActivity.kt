package com.example.digitalhousefoods.ui

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat.startActivity
import com.example.digitalhousefoods.R

class RegisterActivity: AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        //btnRegister.setOnClickListener {
          //  callMain()
        //}

    }

    fun callMain() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }

}