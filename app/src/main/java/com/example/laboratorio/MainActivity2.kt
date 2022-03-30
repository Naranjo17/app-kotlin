package com.example.laboratorio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {


    var txtName: EditText? = null
    var txtEdad: EditText? = null
    var txtTelefono: EditText? = null
    var txtireccion: EditText? = null

    var Materia1: EditText? = null
    var Materia2: EditText? = null
    var Materia3: EditText? = null
    var Materia4: EditText? = null
    var Materia5: EditText? = null
    var nota1: EditText? = null
    var nota2: EditText? = null
    var nota3: EditText? = null
    var nota4: EditText? = null
    var nota5: EditText? = null

    /*
        * Se declara la clase operaciones para la logica del sistema
        * esta instancia deberia estar en el activity principal
        * para poder ser enviada como parametro a esta clase, se pone
        * aquí como ejemplo.
        */
    var operaciones: operaciones? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

     //   registrarEstudiante()
        iniciarComponentes()

    }


    private fun iniciarComponentes() {
        //Se instancia la clase operaciones
        operaciones = operaciones()

        txtName = findViewById<EditText>(R.id.txtName)
        txtEdad = findViewById<EditText>(R.id.txtEdad)
        txtTelefono = findViewById<EditText>(R.id.txtTelefono)
        txtireccion = findViewById<EditText>(R.id.txtDireccion)

        Materia1 = findViewById<EditText>(R.id.Materia1)
        Materia2 = findViewById<EditText>(R.id.Materia2)
        Materia3 = findViewById<EditText>(R.id.Materia3)
        Materia4 = findViewById<EditText>(R.id.Materia4)
        Materia5 = findViewById<EditText>(R.id.Materia5)

        nota1 = findViewById<EditText>(R.id.nota1)
        nota2 = findViewById<EditText>(R.id.nota2)
        nota3 = findViewById<EditText>(R.id.nota3)
        nota4 = findViewById<EditText>(R.id.nota4)
        nota5 = findViewById<EditText>(R.id.nota5)

        val btnRegistro: Button = findViewById(R.id.btnRegistrar)
        btnRegistro?.setOnClickListener {
            enviarDatosEstudiante(registrarEstudiante())
        }
    }

    private fun registrarEstudiante(): Estudiantes {
        var estudiante: Estudiantes = Estudiantes()

        if (txtName?.text.toString() == "" || txtEdad?.text.toString() == "" || txtireccion?.text.toString() == "" || txtTelefono?.text.toString() == "" || Materia1?.text.toString() == "" || Materia2?.text.toString() == "" || Materia3?.text.toString() == "" || Materia4?.text.toString() == "" || Materia5?.text.toString() == "" || nota1?.text.toString() == "" || nota2?.text.toString() == "" || nota3?.text.toString() == "" || nota4?.text.toString() == "" || nota5?.text.toString() == "") {
            Toast.makeText(this, "Completa todos los campos.", Toast.LENGTH_LONG).show()
        } else {
            estudiante.nombre = txtName?.text.toString()
            estudiante.edad = txtEdad?.text.toString().toInt()
            estudiante.direccion = txtireccion?.text.toString()
            estudiante.telefono = txtTelefono?.text.toString()

            estudiante.materia1 = Materia1?.text.toString()
            estudiante.materia2 = Materia2?.text.toString()
            estudiante.materia3 = Materia3?.text.toString()
            estudiante.materia4 = Materia4?.text.toString()
            estudiante.materia5 = Materia5?.text.toString()

            estudiante.nota1 = nota1?.text.toString().toDouble()
            estudiante.nota2 = nota2?.text.toString().toDouble()
            estudiante.nota3 = nota3?.text.toString().toDouble()
            estudiante.nota4 = nota4?.text.toString().toDouble()
            estudiante.nota5 = nota5?.text.toString().toDouble()

            estudiante.promedio = operaciones!!.calcularPromedio(estudiante)
            estudiante.estadoEstudiante = operaciones!!.Materias(estudiante)

            if (operaciones?.Notas(estudiante) === true) {
                operaciones?.registrarEstudiante(estudiante)
                enviarDatosEstudiante(estudiante)
            } else {
                Toast.makeText(this, "Solo se aceptan numeros del 0 al 5", Toast.LENGTH_SHORT)
                    .show()
            }
        }
        return estudiante
    }


    private fun enviarDatosEstudiante(estudiante: Estudiantes) {
        val intent = Intent(this, MainActivity5::class.java)
        val bundle: Bundle = Bundle()

        bundle.putString("txtName", estudiante.nombre)

        bundle.putString("materia1", estudiante.materia1)
        bundle.putString("materia2", estudiante.materia2)
        bundle.putString("materia3", estudiante.materia3)
        bundle.putString("materia4", estudiante.materia4)
        bundle.putString("materia5", estudiante.materia5)

        bundle.putDouble("nota1", estudiante.nota1)
        bundle.putDouble("nota2", estudiante.nota2)
        bundle.putDouble("nota3", estudiante.nota3)
        bundle.putDouble("nota4", estudiante.nota4)
        bundle.putDouble("nota5", estudiante.nota5)

        bundle.putString("Notas", estudiante.estadoEstudiante)
        bundle.putDouble("promedio", estudiante.promedio)

        intent.putExtras(bundle)
        startActivity(intent)
    }
}




