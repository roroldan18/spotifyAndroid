package com.example.practica3

import CardAdapter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatTextView
import androidx.recyclerview.widget.RecyclerView

class WelcomeView : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome_view)

        // Obtener el mensaje de bienvenida del Intent
        val mensajeBienvenida = intent.getStringExtra("mensaje_bienvenida")

        // Mostrar el mensaje en un TextView u otro componente de UI
        val textViewBienvenida: AppCompatTextView = findViewById(R.id.welcome_text)
        textViewBienvenida.text = mensajeBienvenida

        val cardItems = listOf(
            CardItem(R.drawable.song1, "Unstoppable", "Sia"),
            CardItem(R.drawable.song2, "The Wild Project", "Jordi Wild"),
            CardItem(R.drawable.song3, "THe Killer", "Iron Maiden"),
            CardItem(R.drawable.song4, "Welcome to the Jungle", "Guns N Roses"),
            CardItem(R.drawable.song5, "The Unforgiven", "Metallica"),
            CardItem(R.drawable.song6, "The Joe Rogan Experience", "Joe Rogan"),
        )

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.adapter = CardAdapter(cardItems)

    }
}