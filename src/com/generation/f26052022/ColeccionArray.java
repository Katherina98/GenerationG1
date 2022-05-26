package com.generation.f26052022;

import java.util.Arrays;

public class ColeccionArray {

	public static void main(String[] args) {
		//Array ESTATICOS.
		//Los Arrays son un conjunto de datos ordenados según su ingreso, la posición inicial es 0.
		//No podemos cambiar el tamaño. Se mantiene la cantidad de elementos definidos.
		//Solo podemos modificar los elementos ya ingresados en el Array.
		
		String [] colores = {"red", "blue", "pink", "yellow"};
		Integer [] numerosPares = {2, 4, 6, 8, 10};
		int [] primerosNumeros = {1,2,3,4,5};
		float [] numerosF = {1,2,3,4};
		
		//nombreArray [posicion] accedemos al elemento del arreglo que se encuentra en esa posición.
		System.out.println(colores [0]);
		System.out.println(numerosPares [3]);
		System.out.println(primerosNumeros [1]);
		
		//Para modificar un elemento debemos sobreescribirlo indicando la posición.
		numerosPares [3] = 12;
		System.out.println(numerosPares[3]);
		
		//No podemos agregar datos fuera del tamaño del arreglo, en el sgte caso nos enviara error.
		//numerosPares[7] = 10;
		//System.out.println(numerosPares[7]);
		
		//Para poder visualizar el tamaño de nuestro array. 
		System.out.println("Tamaño array colores es: " + colores.length);
		System.out.println("Tamaño array numerosPares es: " + numerosPares.length);
		System.out.println("Tamaño array primerosNumeros es: " + primerosNumeros.length);
		
		//Para visualizar el tipo de dato que tenemos en el array.
		System.out.println(colores);
		System.out.println(numerosPares);
		System.out.println(primerosNumeros);
		System.out.println(primerosNumeros.toString());
		System.out.println(numerosF);
		
		//Imprimir el arreglo completo. 
		System.out.println(Arrays.toString(colores));
		System.out.println(Arrays.toString(numerosPares));
		System.out.println(Arrays.toString(primerosNumeros));
		System.out.println(Arrays.toString(numerosF));
	
		//Podemos recorrer un array y establecer una condición de termino.
		for (int i = 0; i < colores.length; i++) {
			System.out.print(colores[i] +" ");	
		}
		
		for (int i = 0; i < numerosPares.length; i++) {
			System.out.print(numerosPares[i] +" ");	
		}
		for (int i = 0; i < primerosNumeros.length; i++) {
			System.out.println(primerosNumeros[i]);	
		}
		for (int i = 0; i < numerosF.length; i++) {
			System.out.println(numerosF[i]);	
		}
		
		//foreach para recorrer el array completo, no tenemos condición de término mas que el mismo fin del array.
		System.out.println("\n");
		for (int elemento : primerosNumeros) {
			System.out.println(elemento);
		}
		for (String color : colores) {
			System.out.print(color);
		}
		
		
		
	}

}
