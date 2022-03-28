package com.example.laboratorio
import java.io.Serializable

class Materia(nombre:String, nota:Double) {

    var nombreMateria:String=nombre
    var promedioMateria:Double=nota

    override fun toString(): String {
        return "Materia(nombreMateria='$nombreMateria', promedioMateria=$promedioMateria)"

        class Operaciones : Serializable{

        }

        class Estudiante : Serializable{

        }

        class Materia(nombre:String, nota:Double) : Serializable{

        }
    }



}