package com.example.practica3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ProfileViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile_view)

        val usuario = intent.getStringExtra("username")


    }
}