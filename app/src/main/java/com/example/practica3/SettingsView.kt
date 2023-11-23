package com.example.practica3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.widget.AppCompatImageView


class SettingsView : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings_view)

        val usuario = intent.getStringExtra("username")
        val textViewUsuario:TextView = findViewById(R.id.usernameText)
        textViewUsuario.text = "$usuario"

        val buttonView: AppCompatImageView = findViewById(R.id.arrowIcon)
        buttonView.setOnClickListener {
            val intent = Intent(this, ProfileViewActivity::class.java)
            intent.putExtra("username", "$usuario")
            startActivity(intent)
        }

    }
}

