package com.testAutomationCoach.cMethods;

public class EjemploFamosoGuitarrista {

    public static void main(String[] args) {
        Guitarrista[] listaGuitarrista = new Guitarrista[5];
        int x = 0;

        listaGuitarrista[0] = new Guitarrista("Jimmy Hendrix", "Solista", 'M', "Rock");
        GuitarraElectrica g = new GuitarraElectrica("Fender", "Modelo1", 'D', 12);
        g.guitarristas = listaGuitarrista;

        Guitarrista peter = new Guitarrista("Peter", "Sonicos", 'H', "Estilo2");
        for (int i = 0; i < g.guitarristas.length; i++) {
            Guitarrista actual = g.guitarristas[i];
            if (actual.equals(peter)) {
                System.out.println("el guitarrista" + peter.nombre + "toca la guitarra" + g.tipoGuitarra);
            }
        }
    }
}
