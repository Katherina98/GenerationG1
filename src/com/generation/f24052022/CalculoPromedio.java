package com.generation.f24052022;

public class CalculoPromedio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//Establecemos un arreglo para introducir las notas. 	
		Integer[] notas = {20, 50, 67, 99, 10, 60, 88, 70, 58, 10, 33, 50};
		
	//Variables acumuladoras
	int sumaNotas = 0;	
	int notasFueraRango = 0;
	
	//Para recorrer el arreglo de notas utilizamos el FOR.	
		for (int i = 0; i < notas.length; i++) {		
	//Validacion de notas	
			if (notas[i] < 0 || notas[i] > 100) {
				System.out.println("La nota: " + notas[i] + "en la posicion " + (i+1) + ", esta fuera de rango");
				notasFueraRango++;				
			}
	//Vamos guardando la suma acumulada en la variable sumaNotas.		
		sumaNotas = sumaNotas + notas [i];
		}
		
		if (notasFueraRango == 0) {
	//Promedio = suma de todas las notas / cantidad de notas.	
			float promedio = sumaNotas / notas.length;
			
			//PUNTO CRITICO	
				if ( promedio >= 50 && promedio <=100 ) {
					System.out.println("\nEl alumno se encuentra aprobado");
					System.out.println("La suma de las notas es " + sumaNotas + " y su promedio es de " + promedio);
				
				  } else if ( promedio >=0 && promedio <50) {
					  System.out.println("\nEl alumno se encuentra reprobado");
					  System.out.println("La suma de las notas es " + sumaNotas + " y su promedio es de " + promedio);
					  
				  } else { 
					  System.out.println("Error en el calculo, revisar notas entregadas");
				  }
		}
		
		System.out.println("\nEn total tienes " + notasFueraRango + " notas no validas.");
		}
		
	}


	
