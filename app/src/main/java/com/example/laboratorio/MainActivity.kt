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

        components()
    }

    private fun components() {
        var btnEstudiantes:Button = findViewById(R.id.btnEstudiantes)
        var btnEstadisticas:Button = findViewById(R.id.btnEstadisticas)
        var btnAyuda:Button = findViewById(R.id.btnAyuda)

        btnEstudiantes.setOnClickListener{ OnClick(1) }
        btnEstadisticas.setOnClickListener { OnClick(2) }
        btnAyuda.setOnClickListener { OnClick(3) }
    }

    private fun OnClick(button:Int) {
        when(button){
            1 -> { startActivity(Intent(this,MainActivity2::class.java)) }
            2 -> { startActivity(Intent(this,MainActivity4::class.java)) }
            3 -> { startActivity(Intent(this,MainActivity3::class.java)) }
        }
    }
}






