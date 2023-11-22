package com.example.practica3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class MainSong : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_song)

        // Recuperar datos del Intent
        val imageSrc = intent.getIntExtra("imageSrc", R.drawable.default_image_icon_missing_picture_page_vector_40546530) // Reemplaza con el recurso de imagen predeterminado
        val songTitle = intent.getStringExtra("songTitle")
        val artistName = intent.getStringExtra("artistName")

        // Actualizar la interfaz con los datos recibidos
        val songImageView: ImageView = findViewById(R.id.songImage)
        songImageView.setImageResource(imageSrc)

        val songTitleTextView: TextView = findViewById(R.id.songTitle)
        songTitleTextView.text = songTitle

        val artistNameTextView: TextView = findViewById(R.id.artistName)
        artistNameTextView.text = artistName

    }
}