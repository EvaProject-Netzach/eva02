package com.example.eva01

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MenuPrincipalActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.menuprincipal)

        // BUSCAR SOLUCIÓN PARA BOTONES
        // usar def?
        // Enviar a X parte por cada boton

        val buttonBorrarTiempos = findViewById<Button>(R.id.buttonTemporizer)
        val buttonTablas = findViewById<Button>(R.id.buttonStats)
        val buttonPerfil = findViewById<Button>(R.id.buttonProfile)
        val buttonLogout = findViewById<Button>(R.id.buttonCerrarSesion) // Revisar cerrar sesion

        buttonBorrarTiempos.setOnClickListener {
            val intent = Intent(this, BorrarTiemposActivity::class.java)
            startActivity(intent)
        }

        buttonTablas.setOnClickListener {
            val intent = Intent(this, TablasActivity::class.java)
            startActivity(intent)
        }

        buttonPerfil.setOnClickListener {
            val intent = Intent(this, PerfilActivity::class.java)
            startActivity(intent)
        }


        buttonLogout.setOnClickListener {
            val intent = Intent(this, InicioSesionActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
            startActivity(intent)
            finish()
        }
    }
}
