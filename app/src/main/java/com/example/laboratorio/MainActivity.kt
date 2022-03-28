package com.example.laboratorio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlin.concurrent.thread

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val btnEstudiantes = findViewById<Button>(R.id.btnEstudiantes)
        val btnEstadisticas = findViewById<Button>(R.id.btnEstadisticas)
        val btnAyuda = findViewById<Button>(R.id.btnAyuda)



        btnEstudiantes.setOnClickListener {
            val intent:Intent = Intent(this ,MainActivity2::class.java)
            startActivity(intent)


        }
        }
    }

