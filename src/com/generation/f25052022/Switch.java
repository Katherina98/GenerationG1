package com.generation.f25052022;

import java.util.Scanner;
public class Switch {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in); // creacion clase Scanner
		
		//creacion de variables
		int num1, num2, suma, resta;
		float division, multiplicacion;
		
		//pedimos al usuario su dato de entrada
		System.out.println("Ingrese opción: ");
		System.out.println("1.- Sumar \n2.- Restar \n3.- Multiplicar \n4.- Dividir");
		
		//ingresa dato del usuario
		int opcion = Integer.parseInt(entrada.nextLine());
		
		
		//pedir dos numeros
		System.out.println("Ingrese dos números para la operación: ");
		
		//ingresa dos números
		num1 = Integer.parseInt(entrada.nextLine());
		num2 = Integer.parseInt(entrada.nextLine());
		
		switch (opcion) {
		case 1:
			suma = num1 + num2; //redefinimos suma
			System.out.println("La suma es igual a: " + suma);
			break;
		case 2:
			resta = num1 - num2;
			System.out.println("La resta es igual a: " + resta);
			break;
		case 3:
			multiplicacion = num1 * num2;
			System.out.println("La multiplicacion es igual a: " + multiplicacion);
			break;
		case 4:
			if (num2 == 0) {
				
				System.out.println("La división no debe ser por 0");
				
			} else {
			
			division = num1 / num2;
			System.out.println("La division es igual a: " + division);
			}
			break;
		default:
			System.out.println("Opción no reconocida");
			break;
		}
		entrada.close();
	}
}