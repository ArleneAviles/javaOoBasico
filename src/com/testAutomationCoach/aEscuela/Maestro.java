package com.testAutomationCoach.aEscuela;

public class Maestro extends Personal {
  /*  String nombre;
    String apellidoMaterno;
    String apellidoPaterno;
    String titulo;
    int edad;
    Grupo[] group;
    char turno;
    Materia[] asignatura;
    */

    String especialidad;
    String grado;
    String grupo;

    public Maestro(String nombre, String direccion, int edad, String especialidad, String grado, String grupo) {
        super(nombre, direccion, edad);
        this.especialidad = especialidad;
        this.grado = grado;
        this.grupo = grupo;
    }
}

