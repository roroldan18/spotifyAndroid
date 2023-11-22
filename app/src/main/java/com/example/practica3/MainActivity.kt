package com.example.practica3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var usuario: AppCompatEditText = findViewById(R.id.username)

        var password: AppCompatEditText = findViewById(R.id.password)

        var loginButton: AppCompatButton = findViewById(R.id.loginButton)


        loginButton.setOnClickListener {
            val usernameInput = usuario.text.toString()
            val passwordInput = password.text.toString()

            if (usernameInput == "admin" && passwordInput == "admin") {
                // Usuario y contraseña correctos
                val intent = Intent(this, WelcomeView::class.java)
                intent.putExtra("mensaje_bienvenida", "¡Bienvenido, $usernameInput!")
                startActivity(intent)
            } else {
                Toast.makeText(this, "Usuario o contraseña incorrectos", Toast.LENGTH_SHORT).show()
            }
        }
    }
}