    package com.example.eva01

    import android.content.Intent
    import android.os.Bundle
    import android.widget.Button
    import android.widget.EditText
    import android.widget.Toast
    import androidx.appcompat.app.AppCompatActivity

    class InicioSesionActivity : AppCompatActivity() {

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.iniciarsesion)

            val usernameInput = findViewById<EditText>(R.id.usernameInput) // usuario, contra y boton login
            val passwordInput = findViewById<EditText>(R.id.passwordInput)
            val loginButton = findViewById<Button>(R.id.loginButton)

            loginButton.setOnClickListener {
                try {
                    val username = usernameInput.text.toString().trim()
                    val password = passwordInput.text.toString().trim()

                    // Validación de campos vacíos
                    if (username.isEmpty()) {
                        usernameInput.error = "por favor, ingrese su usuario"
                        return@setOnClickListener
                    }
                    if (password.isEmpty()) {
                        passwordInput.error = "por favor, ingrese su contraseña"
                        return@setOnClickListener
                    }

                    // Autenticación básica
                    if (username == "admin" && password == "1234") { // admin t 1234, REEMPLAZAR POR DATOS DE USUARIO REGISTRADO Y VERIFICACIONES
                        // redireccion a la pantalla principal
                        Toast.makeText(this, "Inicio de sesión exitoso", Toast.LENGTH_SHORT).show()
                        val intent = Intent(this, MenuPrincipalActivity::class.java)
                        startActivity(intent)
                    } else {
                        // mensaje de error en caso de usuario o contra incorrecta
                        Toast.makeText(this, "Usuario o contraseña incorrectos", Toast.LENGTH_SHORT).show()
                    }
                } catch (e: Exception) {
                    // excepciones y logeo de mensajes
                    Toast.makeText(this, "Ocurrió un error: ${e.message}", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
