package com.generation.f01062022.ejecicio.main;

import com.generation.f01062022.ejercicioModelo.Flauta;

public class Main {

	public static void main(String[] args) {
	
		Flauta flauta = new Flauta ();
		
		flauta.setNombre("flauta");
		flauta.setTipoFlauta("Traversa");
		flauta.setCantidadAberturas(13);
		flauta.setMaterial("Acero inoxidable");
		flauta.setTamano(30);
		flauta.setTipoBoquilla("Lengueta");
		flauta.setNombreModelo("Flauta traversa 1000 v2.0");
		
		
		System.out.println(flauta.toString());
		
		
	}
}
