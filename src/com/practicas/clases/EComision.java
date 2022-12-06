package com.practicas.clases;

public class EComision extends Empleado{

	protected final static double SUELDO_MINIMO = 750.00;
	protected int numeroClientes;
	protected double montoPorCliente;
	
	
	//CONSTRUCTORES
	
	//Constructor vacío
	public EComision() {
		super();
	}
	
	//Constructor con todos los atributos
	public EComision(String numeroDNI, String nombre, String apellidos, int añoIngreso, double sueldoMinimo, int numeroClientes, double montoPorCliente) {
		super(numeroDNI, nombre, apellidos, añoIngreso);
		this.numeroClientes = numeroClientes;
		this.montoPorCliente = montoPorCliente;
	}
	
	//GETTERS Y SETTERS
	public int getNumeroClientes() {
		return numeroClientes;
	}

	public void setNumeroClientes(int numeroClientes) {
		this.numeroClientes = numeroClientes;
	}

	public double getMontoPorCliente() {
		return montoPorCliente;
	}

	public void setMontoPorCliente(double montoPorCliente) {
		this.montoPorCliente = montoPorCliente;
	}

	public static double getSueldoMinimo() {
		return SUELDO_MINIMO;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
