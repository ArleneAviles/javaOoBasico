package com.testAutomationCoach.eHerencia.doctores;

public class ProfesionalDeSalud {

    protected String nombre;
    protected String profesion;
    public int fallecidos;

    public static void main(String[] args) {

    }

    public ProfesionalDeSalud(String nombre, String profesion, int fallecidos) {
        this.nombre = nombre;
        this.profesion = profesion;
        this.fallecidos = fallecidos;
    }

    public void tratarPaciente() {}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }


}
