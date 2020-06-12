package com.testAutomationCoach.bVariables;

import com.testAutomationCoach.aAbstraccion.ArticuloAmazon;
import com.testAutomationCoach.aAbstraccion.Perro;

public class Instanciacion {

    static Perro fido;
    static ArticuloAmazon tablet;
    static int numeroEstudiantes;

    public static void main(String[] args) {
        //cuanta memoria ocupan estas variables?
        char x = 'N';
        int numeroTotalEstudiantes = numeroEstudiantes + 3;
        String saludo = "Hola";
        String fraseBenito = "El respeto al derecho ajeno es la paz";

        Perro firulais2 = new Perro(23,"OtroMas", "Fido2");
        fido.ladrar();
        firulais2.ladrar();
        tablet.toString();
        ArticuloAmazon laptop = new ArticuloAmazon();
        laptop.toString();
    }
}
