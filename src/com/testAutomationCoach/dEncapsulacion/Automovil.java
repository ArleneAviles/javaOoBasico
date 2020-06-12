package com.testAutomationCoach.dEncapsulacion;

import libs.Input;

import java.util.Objects;

public class Automovil {
	//Atributos
	
	private String marca;
	private double velocidadActual;
	private double maximaVelocidad;
	private String tipoDeTransmision;
	private int numDePuertas;
	private int numDeLlantas;

	public int getNumRevoluciones() {
		return numRevoluciones;
	}

	public int getLitrosGasolina(){
		return litrosGasolina;
	}

	public int getTemperatura(){
		return temperatura;
	}

	private int numRevoluciones = 0;
	private int litrosGasolina = 15;
	private int temperatura = 0;


	Automovil() {
		marca = "Ford";
		velocidadActual = 0.0;
		maximaVelocidad = 200.0;
		tipoDeTransmision = "Manual";
		numDePuertas = 2;
		numDeLlantas = 4;
	}

	Automovil(String marca, double maximaVel, String tipoTransmision, int numPuertas, int numLlantas) {
		this.marca = marca;
		this.velocidadActual = 0.0;
		this.maximaVelocidad = maximaVel;
		this.tipoDeTransmision = tipoTransmision;
		this.numDePuertas = numPuertas;
		this.numDeLlantas = numLlantas;
	}
	//comportamiento
	public void acelerar() {
		if (numRevoluciones == 0) {
			System.out.println("El auto esta apagado");
		} else {
			Input.print("run run\n");
			this.velocidadActual += 5.0;
			this.numRevoluciones += 50;
			this.temperatura += 20;
			this.litrosGasolina -= 5;
		}
	}

	public void frenar() {
		if (numRevoluciones == 0) {
			System.out.println("El auto esta apagado");
		} else {
			Input.print("Screeeeech!\n");
			this.velocidadActual = 0;
			this.numRevoluciones = 0;
			this.temperatura -= 5;
		}
	}

	public void retroceder() {
		Input.print("piii piii piii piii\n");
		this.velocidadActual -= -5;
		this.numRevoluciones -= 2;
		this.temperatura += 10;
	}

	public void encendido() {
		Input.print("carro encendido\n");
		this.numRevoluciones += 1000;
		this.temperatura += 10;
		this.litrosGasolina -= 1;
	}

	public void apagado(){
		Input.print("apagando carro\n");
		this.numRevoluciones = 0;
		this.temperatura -= 10;
	}

	public double getVelocidad() {
		return velocidadActual;
		
	}
}
