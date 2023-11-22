package com.example.practica3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatTextView

class WelcomeView : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome_view)

        // Obtener el mensaje de bienvenida del Intent
        val mensajeBienvenida = intent.getStringExtra("mensaje_bienvenida")

        // Mostrar el mensaje en un TextView u otro componente de UI
        val textViewBienvenida: AppCompatTextView = findViewById(R.id.welcome_text)
        textViewBienvenida.text = mensajeBienvenida
    }
}