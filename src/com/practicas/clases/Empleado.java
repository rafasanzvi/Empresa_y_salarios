package com.practicas.clases;

public abstract class Empleado {

	protected String numeroDNI;
	protected String nombre;
	protected String apellidos;
	protected int añoIngreso;
	
	//CONSTRUCTORES
	
	//Constructor con todos los parámetros
	public Empleado(String numeroDNI, String nombre, String apellidos, int añoIngreso) {
		super();
		this.numeroDNI = numeroDNI;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.añoIngreso = añoIngreso;
	}

	// Constructor vacío
	public Empleado() {
		super();
	}

	//GETTERS Y SETTERS
	public String getNumeroDNI() {
		return numeroDNI;
	}

	public void setNumeroDNI(String numeroDNI) {
		this.numeroDNI = numeroDNI;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getAñoIngreso() {
		return añoIngreso;
	}

	public void setAñoIngreso(int añoIngreso) {
		this.añoIngreso = añoIngreso;
	}
	
	
	//Métodos personalizados
	
	public void imprimir() {
		
	}
	
	public double obtenerSalario() {
		return -1;
	}
	
	
}
