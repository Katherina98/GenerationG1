package com.generation.f24052022;

import java.util.Scanner;
// CTRL + SHIFT + O 
public class Condicional {

	public static void main(String[] args) {
		
		//Para capturar el ingreso por consola (la variable en este caso es "sc")
		Scanner sc = new Scanner(System.in); 
		
		//Establecer punto CRITICO >=18.
		int MayoriaEdad = 18;
		
		//Solicitar al usuario el ingreso de edad. 
		System.out.println("Ingrese su edad");
		int edad = sc.nextInt();
		
		
		//Validar la mayoria de edad
		if (edad >= MayoriaEdad) {
			System.out.println("El usuario es mayor de edad. Ingreso autorizado");
			
		} else {
			System.out.println("El usuario es menor de edad. No esta permitido su ingreso");
		}
		
		
		String nombre = sc.nextLine();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
