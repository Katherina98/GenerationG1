package com.generation.f23052022;

public class CalculoPromedio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//Establecer cantidad de notas	
	//int cantidadNotas = 12 = notas.length.
	//Establecemos un arreglo para introducir las notas. 	
		Integer[] notas = {20, 50, 67, 99, 10, 0, 88, 77, 58, 79, 33, 50};
		
	
	int sumaNotas = 0;	
		
	//Para recorrer el arreglo de notas utilizamos el FOR.	
		for (int i = 0; i < notas.length; i++) {
		sumaNotas = sumaNotas + notas [i];
			
		}
		
	//Muestra del resultado a la variable sumaNotas.
		
		System.out.println("suma de notas " + sumaNotas);
		
	//promedio = suma de todas las notas / cantidad de notas.	
		
		float promedio = sumaNotas / notas.length;
		
		if ( promedio >= 50 && promedio <=100 ) {
			System.out.println("Aprobado");
		
		   if ( promedio >=0 && promedio <=49) {
			System.out.println("Reprobado");		   	   
		   }
		}
	}
}
