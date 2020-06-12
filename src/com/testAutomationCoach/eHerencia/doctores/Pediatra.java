package com.testAutomationCoach.eHerencia.doctores;

//extends = is a
public class Pediatra extends Doctor {

    public Pediatra(String nombre, String profesion) {
        super(nombre, profesion);
    }

    public void examinarInfantes() {
        System.out.println("da paletitas a los niños");

    }

    public void tratarPaciente(){
        System.out.println("pesar al bebe, le da palmaditas");

    }

    public void prescribirMedicina(){

        System.out.println("Tome su mejoralito y su motrin");
    }

}
