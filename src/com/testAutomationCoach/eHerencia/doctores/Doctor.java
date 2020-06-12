package com.testAutomationCoach.eHerencia.doctores;

import javax.print.Doc;

public class Doctor extends ProfesionalDeSalud{

    public String especialidad;
    private double salario;

    public Doctor(String nombre, String profesion, int fallecidos, String especialidad, double salario) {
        super(nombre, profesion, fallecidos);
        this.especialidad = especialidad;
        this.salario = salario;
    }

    public Doctor(String nombre, String profesion){
        super(nombre, "Doctor", 4);
        this.especialidad = especialidad;
    }

    public Doctor(String nombre){
        super(nombre, null, 5);
        this.especialidad = null;
    }


    public void tratarPaciente(){
        System.out.println("Saque la lengua y diga aaah\n");
        System.out.println("pegar con el martitllito en la rodilla\n");
    }

    public void prescribirMedicina() {
        System.out.println("Debe de tomar pastilla");
    }

    public String getEspecialidad() {
        return null;
    }
}
