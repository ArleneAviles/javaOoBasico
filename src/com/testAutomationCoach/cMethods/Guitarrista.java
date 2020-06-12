package com.testAutomationCoach.cMethods;

public class Guitarrista {
    String nombre;
    String banda;
    char genero;
    String estiloMusical;
    GuitarraElectrica [] guitarrista;

    //se crea el constructor


    public Guitarrista(String nombre, String banda, char genero, String estiloMusical, GuitarraElectrica[] guitarrista) {
        this.nombre = nombre;
        this.banda = banda;
        this.genero = genero;
        this.estiloMusical = estiloMusical;
        this.guitarrista = guitarrista;
    }

 /*   public Guitarrista(String nombre, String banda, char genero, String estiloMusical) {
        this.nombre = nombre;
        this.banda = banda;
        this.genero = genero;
        this.estiloMusical = estiloMusical;
        guitarrista = new GuitarraElectrica("Fender", "Modelo3", 'I', 3);
    }*/

  /*  public boolean equals(guitarrista g){
        return this.nombre.equals()
        @Override
        public boolean equals(Object obj) {
            Guitarrista guitarro2 = (Guitarrista) obj;
            return this.nombre == guitarro2.nombre;
        }
    }*/

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getBanda() {
        return banda;
    }

    public void setBanda(String banda) {
        this.banda = banda;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public String getEstiloMusical() {
        return estiloMusical;
    }

    public void setEstiloMusical(String estiloMusical) {
        this.estiloMusical = estiloMusical;
    }
}
