package com.testAutomationCoach.aAbstraccion;

public class EjemploPerro {

    static Perro firulais;

    public static void main(String[] args) {
        int edad;
        String nombre;
        Perro fido = new Perro(34, "Husky", "Alakir");
        fido.nombre = "Fido";
        fido.raza = "Gran Danes";
        fido.tamanio = 45.0;

        fido.ladrar();
        fido.correr();
        fido.comer();

        Perro solovino = new Perro(34.5, "Corriente", "Solovino");
        System.out.println("Nombre" + solovino.nombre);

        libs.Input.print("Nombre " + fido.nombre + "\n");
        libs.Input.print("Raza " +fido.raza + "\n");
        libs.Input.print("Tamaño " + fido.tamanio + "\n");
        firulais = fido;
        firulais.ladrar();

    }
}
