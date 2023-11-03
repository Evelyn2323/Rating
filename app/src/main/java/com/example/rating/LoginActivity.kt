package com.example.rating

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class LoginActivity : AppCompatActivity() {
    private lateinit var usernameEditText: EditText
    private lateinit var passwordEditText: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        usernameEditText = findViewById(R.id.usernameEditText)
        passwordEditText = findViewById(R.id.passwordEditText)
        val loginButton: Button = findViewById(R.id.loginButton)

        loginButton.setOnClickListener {
            val username = usernameEditText.text.toString()
            val password = passwordEditText.text.toString()

            // Aquí verifica las credenciales (por ejemplo, en una base de datos o mediante una API).
            // Si las credenciales son válidas, puedes redirigir al usuario a la vista de inicio (HomeActivity).
            if (isValidCredentials(username, password)) {
                val intent = Intent(this, HomeActivity::class.java)
                intent.putExtra("username", username)  // Puedes pasar información a la vista de inicio.
                startActivity(intent)
            } else {
                // Muestra un mensaje de error o realiza otra acción apropiada.
            }
        }
    }

    private fun isValidCredentials(username: String, password: String): Boolean {
        // Aquí deberías implementar la lógica para verificar las credenciales.
        // Simplemente un ejemplo:
        return username == "usuario" && password == "contraseña"
    }
}
