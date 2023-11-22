package com.example.practica3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SettingsView : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings_view)

        val usuario = intent.getStringExtra("username")
        val textViewUsuario:TextView = findViewById(R.id.usernameText)
        textViewUsuario.text = "$usuario"

    }
}