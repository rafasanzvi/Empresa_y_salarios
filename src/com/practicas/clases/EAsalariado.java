package com.practicas.clases;

public class EAsalariado extends Empleado {

	private double sueldoBasico;

	//CONSTRUCTORES
	
	//Constructor vacío
	public EAsalariado() {
		super();
		
	}

	//Constructor con todas las propiedades
	public EAsalariado(String numeroDNI, String nombre, String apellidos, int añoIngreso, double sueldoBasico ) {
		super(numeroDNI, nombre, apellidos, añoIngreso);
		this.sueldoBasico = sueldoBasico;
	}

	//GETTERS Y SETTERS
	public double getSueldoBasico() {
		return sueldoBasico;
	}

	public void setSueldoBasico(double sueldoBasico) {
		this.sueldoBasico = sueldoBasico;
	}
	
	
	
}
