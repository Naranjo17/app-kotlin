package com.example.laboratorio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity5 : AppCompatActivity() {


        var nombreEs:TextView? = null

        var materiaEs1:TextView? = null
        var materiaEs2:TextView? = null
        var materiaEs3:TextView? = null
        var materiaEs4:TextView? = null
        var materiaEs5:TextView? = null

        var nota1Es:TextView? = null
        var nota2Es:TextView? = null
        var nota3Es:TextView? = null
        var nota4Es:TextView? = null
        var nota5Es:TextView? = null

        var promedioEs:TextView? = null
        var ganoPerdio:TextView? = null

        var operaciones:operaciones? = null

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main5)

        getDatosEstudiante()

        }



        private  fun getDatosEstudiante() {
            operaciones = operaciones()

            nombreEs = findViewById(R.id.txtNombreEstudiante)

            materiaEs1 = findViewById(R.id.txtMateria01)
            materiaEs2 = findViewById(R.id.txtMateria02)
            materiaEs3 = findViewById(R.id.txtMateria03)
            materiaEs4 = findViewById(R.id.txtMateria04)
            materiaEs5 = findViewById(R.id.txtMateria05)

            nota1Es = findViewById(R.id.txtNota01)
            nota2Es = findViewById(R.id.txtNota02)
            nota3Es = findViewById(R.id.txtNota03)
            nota4Es = findViewById(R.id.txtNota04)
            nota5Es = findViewById(R.id.txtNota05)

            promedioEs = findViewById(R.id.txtPromedioE)
            ganoPerdio = findViewById(R.id.txtGanoPerdio)

            enviarDatosEs()
        }

        private fun enviarDatosEs() {
            var bundleVerDatos:Bundle? = this.intent.extras

            if(bundleVerDatos != null){
                nombreEs!!.text = "${bundleVerDatos.getString("txtName")}"

                materiaEs1!!.text = "${bundleVerDatos.getString("materia1")}"
                materiaEs2!!.text = "${bundleVerDatos.getString("materia2")}"
                materiaEs3!!.text = "${bundleVerDatos.getString("materia3")}"
                materiaEs4!!.text = "${bundleVerDatos.getString("materia4")}"
                materiaEs5!!.text = "${bundleVerDatos.getString("materia5")}"

                nota1Es!!.text = "${bundleVerDatos.getDouble("nota1")}"
                nota2Es!!.text = "${bundleVerDatos.getDouble("nota2")}"
                nota3Es!!.text = "${bundleVerDatos.getDouble("nota3")}"
                nota4Es!!.text = "${bundleVerDatos.getDouble("nota4")}"
                nota5Es!!.text = "${bundleVerDatos.getDouble("nota5")}"

                promedioEs!!.text = "${bundleVerDatos.getDouble("promedio")}"
                ganoPerdio!!.text = "${bundleVerDatos.getString("Notas")}"
            }
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
    }
