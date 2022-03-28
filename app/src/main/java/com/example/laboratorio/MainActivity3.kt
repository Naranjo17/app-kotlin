package com.example.laboratorio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val Name = findViewById<TextView>(R.id.txtName)
        val Edad = findViewById<TextView>(R.id.txtEdad)
        val Direccion = findViewById<TextView>(R.id.txtDireccion)
        val Cell = findViewById<TextView>(R.id.txtTelefono)

        val Materia1 = findViewById<TextView>(R.id.Materia1)
        val Materia2 = findViewById<TextView>(R.id.Materia2)
        val Materia3 = findViewById<TextView>(R.id.Materia3)
        val Materia4 = findViewById<TextView>(R.id.Materia4)
        val Materia5 = findViewById<TextView>(R.id.Materia5)

        val Nota1 = findViewById<TextView>(R.id.nota1)
        val Nota2 = findViewById<TextView>(R.id.nota2)
        val Nota3 = findViewById<TextView>(R.id.nota3)
        val Nota4 = findViewById<TextView>(R.id.nota4)
        val Nota5 = findViewById<TextView>(R.id.nota5)

        val texto = findViewById<TextView>(R.id.texto)

        texto.setText(
            " Estudiante(Nombre='$Name',Edad='$Edad',"+" " +
            " Direccion='$Direccion', Telefono= '$Cell'," +
            " materia1='$Materia1', materia2='$Materia2'," +
            " materia3= '$Materia3', materia4='$Materia4', materia5='$Materia5',"+
            " nota1='$Nota1', nota2='$Nota2'," +
            " nota3= '$Nota3', nota4='$Nota4', nota5='$Nota5',)"
        )





    }
}