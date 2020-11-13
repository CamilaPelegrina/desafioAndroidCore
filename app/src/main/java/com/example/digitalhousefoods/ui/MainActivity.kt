 package com.example.digitalhousefoods.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentManager
import com.example.digitalhousefoods.R

class MainActivity : AppCompatActivity() {

    companion object{
        lateinit var fm : FragmentManager
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fm = supportFragmentManager
        fm.beginTransaction().add(R.id.fragmentContainer, FragmentHome(), null).commit()

    }
}