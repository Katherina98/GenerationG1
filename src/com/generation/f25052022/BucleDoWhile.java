package com.generation.f25052022;

import java.util.Scanner;

public class BucleDoWhile {


	public static void main(String[] args) {
		//Do While se ejecutara al menos una vez cuando la condicion es falsa.
		
		int termino = 8;
		do {
			System.out.println("el valor de termino es: " + termino);
			termino++;
			
		} while (termino <= 10);

		System.out.println("************");
		
		
		//While no se ejecutara si la condicion es falsa.
		while (termino <= 10) {
		System.out.println("While el valor de termino es " + termino);
		termino++; 
		}
		System.out.println("fin");
		
		Scanner sc = new Scanner(System.in);
		int opcion = 0;
		
		do {
			System.out.println(" (0) salir \n (1) sumar \n (2) restar \n (3) multiplicar");
			opcion = sc.nextInt();
			
		//Si la condicion es verdadera el do while se vuelve a repetir.	
		} while (opcion < 0 || opcion > 4);
		}
	}

