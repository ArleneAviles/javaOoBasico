package com.testAutomationCoach.aEscuela;

public class MobiliarioSilla extends Mobiliario {

    int numPatas;
    String servicio;
    int numPersonas;

    public MobiliarioSilla(String nombre, String tipo, String ubicacion, int cantidad, int numPatas, String servicio, int numPersonas) {
        super(nombre, tipo, ubicacion, cantidad);
        this.numPatas = numPatas;
        this.servicio = servicio;
        this.numPersonas = numPersonas;
    }
}
