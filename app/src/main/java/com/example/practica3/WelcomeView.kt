package com.example.practica3

import CardAdapter
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatImageButton
import androidx.appcompat.widget.AppCompatTextView
import androidx.recyclerview.widget.RecyclerView

class WelcomeView : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome_view)

        // Obtener el mensaje de bienvenida del Intent
        val usuario = intent.getStringExtra("username")

        // Mostrar el mensaje en un TextView u otro componente de UI
        val textViewBienvenida: AppCompatTextView = findViewById(R.id.welcome_text)
        textViewBienvenida.text = "Bienvenido, $usuario"

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

        val buttonAjuste: AppCompatImageButton  = findViewById(R.id.settings_button)
        buttonAjuste.setOnClickListener {
            val intent = Intent(this, SettingsView::class.java)
            intent.putExtra("username", "$usuario")
            startActivity(intent)
        }

        val buttonTime: AppCompatImageButton = findViewById(R.id.time_button)
        buttonTime.setOnClickListener {
            val intent = Intent(this, TimeView::class.java)
            startActivity(intent)
        }

    }
}