package com.example.eva01

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.Switch
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class BorrarTiemposActivity : AppCompatActivity() {

    @SuppressLint("UseSwitchCompatOrMaterialCode")
    private lateinit var switch1: Switch
    @SuppressLint("UseSwitchCompatOrMaterialCode")
    private lateinit var switch2: Switch
    private lateinit var buttonEditTimers: Button
    private lateinit var buttonVolver: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.borrartiempos)

        // inicializacion de vistas
        initViews()
        // configurar listeners
        setupListeners()
    }

    private fun initViews() { // Los botones del tipo swtich en kotlin / revisar documentacion kotlin
        switch1 = findViewById(R.id.switch1)
        switch2 = findViewById(R.id.switch2)
        buttonEditTimers = findViewById(R.id.buttonEditTimers)
        buttonVolver = findViewById(R.id.buttonVolver)
    }

    private fun setupListeners() { // crear raciones para los peces (preconfigurar tiempos de ejemplo)
        // listener para Switch 1
        switch1.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                Toast.makeText(this, "racion 00:17 activada", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "racion 00:17 desactivada", Toast.LENGTH_SHORT).show()
            }
        }

        // listener para switch 2
        switch2.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                //
                Toast.makeText(this, "racion 12:17 activada", Toast.LENGTH_SHORT).show()
            } else {
                // logica para cuando se desactiva
                Toast.makeText(this, "racion 12:17 desactivada", Toast.LENGTH_SHORT).show()
            }
        }

        // listener para el boton editar temporizadores (obviamewnte aun no funcional waos)
        buttonEditTimers.setOnClickListener {
            Toast.makeText(this, "Editando temporizadores...", Toast.LENGTH_SHORT).show()
        }

        // listener para el boton Volver
        buttonVolver.setOnClickListener {
            // finalizar la actividad actual para volver a la de antes
            finish()
        }
    }
}