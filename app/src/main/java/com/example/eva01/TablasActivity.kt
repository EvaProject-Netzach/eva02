package com.example.eva01

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton

class TablasActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tablas)
        // aqui s econfigura el boton volver
        findViewById<MaterialButton>(R.id.outlinedButton).setOnClickListener {
            // aqui se cierra la actividad y se devuelve a volver
            finish()

            // base de datos pendiente, no tengo ni la menor idea de como hacerla
        }
    }
}