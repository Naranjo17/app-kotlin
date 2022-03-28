package com.example.laboratorio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {


        var txtName:EditText?=null
        var txtEdad:EditText?=null
        var txtTelefono:EditText?=null
        var txtireccion:EditText?=null

        var Materia1:EditText?=null
        var Materia2:EditText?=null
        var Materia3:EditText?=null
        var Materia4:EditText?=null
        var Materia5:EditText?=null
        var nota1:EditText?=null
        var nota2:EditText?=null
        var nota3:EditText?=null
        var nota4:EditText?=null
        var nota5:EditText?=null

        /*
            * Se declara la clase operaciones para la logica del sistema
            * esta instancia deberia estar en el activity principal
            * para poder ser enviada como parametro a esta clase, se pone
            * aquí como ejemplo.
            */
        var operaciones:operaciones?=null


        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main2)

            iniciarComponentes()

        }

        private fun iniciarComponentes() {
            //Se instancia la clase operaciones
            operaciones= operaciones()

            txtName = findViewById<EditText>(R.id.txtName)
            txtEdad=findViewById<EditText>(R.id.txtEdad)
            txtTelefono=findViewById<EditText>(R.id.txtTelefono)
            txtireccion=findViewById<EditText>(R.id.txtDireccion)

            Materia1=findViewById<EditText>(R.id.Materia1)
            Materia2=findViewById<EditText>(R.id.Materia2)
            Materia3=findViewById<EditText>(R.id.Materia3)
            Materia4=findViewById<EditText>(R.id.Materia4)
            Materia5=findViewById<EditText>(R.id.Materia5)

            nota1=findViewById<EditText>(R.id.nota1)
            nota2=findViewById<EditText>(R.id.nota2)
            nota3=findViewById<EditText>(R.id.nota3)
            nota4=findViewById<EditText>(R.id.nota4)
            nota5=findViewById<EditText>(R.id.nota5)

            var btnRegistro:Button=findViewById(R.id.btnRegistrar)
            btnRegistro.setOnClickListener { registrarEstudiante()


            }

        }

        private fun registrarEstudiante() {
            //Se instancia la clase estudiante y se mapean los elementos del formulario
            var est:Estudiantes= Estudiantes()
            est.nombre=txtName?.text.toString()
            est.edad=txtEdad?.text.toString().toInt()
            est.direccion=txtireccion?.text.toString()
            est.telefono=txtTelefono?.text.toString()



            //Si se va a trabajar las materias y notas en la misma clase Estudiante
            est.materia1=Materia1?.text.toString()
            est.materia2=Materia2?.text.toString()
            est.materia3=Materia3?.text.toString()
            est.materia4=Materia4?.text.toString()
            est.materia5=Materia5?.text.toString()

            est.nota1= nota1?.text.toString().toDouble()
            est.nota2= nota2?.text.toString().toDouble()
            est.nota3= nota3?.text.toString().toDouble()
            est.nota4= nota4?.text.toString().toDouble()
            est.nota5= nota5?.text.toString().toDouble()

            //Se asigna el promedio delegando el calculo al metodo de la clase operaciones
            est.promedio= operaciones!!.calcularPromedio(est)

            operaciones?.registrarEstudiante(est)

            operaciones?.imprimirListaEstudiantes()






        }


    }






