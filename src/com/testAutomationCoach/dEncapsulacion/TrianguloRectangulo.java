package com.testAutomationCoach.dEncapsulacion;

public class TrianguloRectangulo {

	//propiedades o campos
	private double base;
	private double altura;

	public TrianguloRectangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}

	//metodos o comportamiento
	public double sacarArea() {
		double area= (this.base*this.altura)/2;
		return area;
	}
	public double sacarPerimetro() {
		double perimetro= this.base*3;
	    return perimetro;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public String toString() {
		return "Base es " + this.base + " Altura es "+ this.altura;
	}

}
