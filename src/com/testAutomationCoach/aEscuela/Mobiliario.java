package com.testAutomationCoach.aEscuela;

public class Mobiliario {
  /*  int mesa;
    int computadora;
    int silla;
    int proyector;
    int impresora;
    int pizarron;
    int aireAcondicionado;
*/

    String nombre;
    String tipo;
    String ubicacion;
    int cantidad;

    public Mobiliario(String nombre, String tipo, String ubicacion, int cantidad) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.ubicacion = ubicacion;
        this.cantidad = cantidad;
    }
}
