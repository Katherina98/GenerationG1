package com.generation.f26052022;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class ColeccionArrayList {

	public static void main(String[] args) {
	/*  ArrayList Dinamicos. 
		Podemos modificar el tamaño agregando elementos según sea requerido.
		Podemos crear una instancia de clase.
		Este arreglo es de tipo objeto.
		ArrayList <tipo de dato> nombre_variable = new ArrayList <tipo de dato> ();
	*/
		ArrayList<String> colores = new ArrayList <String>();
		ArrayList<Integer> numerosPares = new ArrayList <Integer>();
		
		//Para agregar un dato a nuestro array debemos colocar .add(dato)
		colores.add("red");
		colores.add("blue");
		colores.add("red");
		System.out.println(colores);
		//Si existe un elemento en la posición ingresada, lo desplaza a la derecha.
		colores.add(1, "pink");
		colores.add("black");
		System.out.println(colores);
		//Para poder visualizar el tamaño del ArrayList debemos usar size. 
		System.out.println("El largo del arreglo colores es: " + colores.size());
		
		//Para acceder a un elemento
		System.out.println("En la posición 2 tenemos el color " + colores.get(2));
		
		//Para modificar un elemento en particular según su indice.
		colores.set(1, "yellow");
		System.out.println(colores);
		
		//Para eliminar un dato, según la ubicación en el indice.
		colores.remove("red");
		colores.remove(2);
		System.out.println(colores);
		
		//Para eliminar todos los elementos del arreglo.
		//colores.clear();
		//System.out.println(colores);
		
		System.out.println("*************");
		//Podemos recorrer un array y establecer una condición de termino.
		for (int i = 0; i < colores.size(); i++) {
			System.out.print(colores.get(i) + " ");
		}
		System.out.println("\n");
		//foreach para recorrer el array completo, no tenemos condición de término mas que el mismo fin del array.
		for (String color : colores) {
			System.out.println(color);
		}
		
		//Para ordenar nuestro arreglo utilizamos collections.sort(nombre_array).
		//Lo ordena de forma ascendente.
		//Su impacto no es temporal, desde que lo utilizamos el arreglo cambiara su orden.
		Collections.sort(colores);
		System.out.println(colores);
		
		colores.set(2, "pink");
		colores.add("grey");
		System.out.println(colores);
		
				numerosPares.add(14);
				numerosPares.add(14);
				numerosPares.add(2);
				numerosPares.add(8);
				numerosPares.add(6);
				numerosPares.add(10);
				numerosPares.add(20);
				System.out.print(numerosPares+" ");
				
				Collections.reverse(numerosPares);
				System.out.println(numerosPares);
				
				//Ordena los datos de forma ascendente
				Collections.sort(numerosPares);
				System.out.println(numerosPares+" ");
				
				//Ordena los datos al reves de como se encuentran actualmente.
				Collections.reverse(numerosPares);
				System.out.println(numerosPares);
				
				
				Scanner sc = new Scanner(System.in); 
				
			//Para agregar datos al Array por medio de la consola. 	
				for (int i = 0; i < 5; i++) {
					
				System.out.println("Ingrese un color nro " + (i+1) + ": " );
				colores.add(sc.nextLine());	
				}
				
			System.out.println(colores);	
	}
}
