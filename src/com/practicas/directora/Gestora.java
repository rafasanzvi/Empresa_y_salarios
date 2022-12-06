package com.practicas.directora;

import com.practicas.clases.EAsalariado;
import com.practicas.clases.EComision;

public class Gestora {
 
	public static void main(String[] args) {
		
		EAsalariado asalariado1 = new EAsalariado("569587A", "Javier" ,"Gómez" , 2008, 1225.00);
		EAsalariado asalariado2 = new EAsalariado("896325D", "Maria", "Núñez", 2013, 1155.00 );
		EComision comisionado1 = new EComision("695235B", "Eva", "Nieto", 2010, 750.00, 179, 8.10);
		EComision comisionado2 = new EComision("741258C", "José", "Ruiz", 2012, 750.00, 81, 7.90);
	}
}
