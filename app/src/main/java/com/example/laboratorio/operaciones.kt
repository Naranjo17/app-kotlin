package com.example.laboratorio

class operaciones {

    companion object{ var listaEstudiantes = arrayListOf<Estudiantes>() }

    fun registrarEstudiante(estudiante: Estudiantes){

        listaEstudiantes.add(estudiante)
    }

    fun valueNotes (numero:Double):Boolean { return numero in 0.0 .. 5.0 }

    fun addEstudiantes(): Int{ return listaEstudiantes.count() }

    fun AddLose() : Int { return countEst("Perdio")}

    fun calcularPromedio(estudiante: Estudiantes): Double {
        var promedio = (estudiante.nota1 + estudiante.nota2 + estudiante.nota3 + estudiante.nota4 + estudiante.nota5)/5
        return promedio
    }

    fun Notas (estudiante: Estudiantes): Boolean {
        return (valueNotes(estudiante.nota1) === true &&
                valueNotes(estudiante.nota2) === true &&
                valueNotes(estudiante.nota3) === true &&
                valueNotes(estudiante.nota4) === true &&
                valueNotes(estudiante.nota5) === true)

    }

    fun Materias(estudiante: Estudiantes): String {
        var estadoEstudiante = ""
        if(estudiante.promedio > 3.5) { estadoEstudiante = "Gano" }
        else if(estudiante.promedio > 2.5) { estadoEstudiante = "Puede recuperar" }
        else { estadoEstudiante = "No puede recuperar" }
        return estadoEstudiante
    }

    fun countEst(estadoE:String): Int {
        var contadorE:Int = 0
        for (i in listaEstudiantes){ if(i.estadoEstudiante == estadoE){ contadorE++ } }
        return  contadorE
    }

}