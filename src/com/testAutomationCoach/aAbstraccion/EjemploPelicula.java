package com.testAutomationCoach.aAbstraccion;

public class EjemploPelicula {

    public static void main(String[] args) {
        Pelicula p = new Pelicula();
        p.titulo = " El silencio de los inocentes";
        p.clasificacion = " Drama";
        p.region = 4;
        p.sinopsis = " Super actuacion de Anthony Hopkins";
        p.tiempoTrailer = 260;
        p.tipoPago = " Tarjeta Credito";

        p.comprar();
        p.clicButton();
        p.estreno();
        p.rentarPelicula();

        libs.Input.print("Titulo: " + p.titulo + "\n");
        libs.Input.print("Clasificacion: " + p.clasificacion + "\n");
        libs.Input.print("Region: " + p.region + "\n");
        libs.Input.print("Sinopsis: " + p.sinopsis + "\n");
    }

}
