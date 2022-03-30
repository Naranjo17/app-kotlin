package com.example.laboratorio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity4 : AppCompatActivity() {

    var eProcesados:TextView? = null
    var eGanaron:TextView? = null
    var ePerdieron:TextView? = null
    var ePuedeRecuperar:TextView? = null
    var eCalculos:operaciones? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        Volver()
        Estadisticas()
    }

    private fun Volver(){
        var btnEstadisticas: Button = findViewById(R.id.btnVolverEstadisticas)
        btnEstadisticas.setOnClickListener{ OnClick(1) }
    }

    private fun OnClick(button:Int){
        when(button){
            1 -> { startActivity(Intent(this,MainActivity::class.java)) }
        }
    }

    private fun Estadisticas() {
        eCalculos = operaciones()
        eProcesados = findViewById(R.id.editProcesados)
        eGanaron = findViewById(R.id.editGanaron)
        ePerdieron = findViewById(R.id.editPerdieron)
        ePuedeRecuperar = findViewById(R.id.editRecuperar)

        DatosEstadisticas()
    }

    private fun DatosEstadisticas(){
        eProcesados!!.text = eCalculos!!.addEstudiantes().toString()
        eGanaron!!.text = eCalculos!!.countEst("Gano el periodo").toString()
        ePerdieron!!.text = eCalculos!!.AddLose().toString()
        ePuedeRecuperar!!.text = eCalculos!!.countEst("Puede recuperar el periodo").toString()
    }
}
