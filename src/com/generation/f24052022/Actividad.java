package com.generation.f24052022;

import java.util.Scanner;

public class Actividad {
	public static void main(String[] args) {
		
		// Definici�n de variables.
		int mayoriaEdad = 18;
		int saldoMinimo = 50000;
		int apuestaMinima = 10000;
		
		String nombre, apellido, direccion;
		
	 Scanner entrada = new Scanner(System.in);
	
		// Solicitud de edad
		System.out.println("Ingrese su edad");
		int edad = (entrada.nextInt());
		entrada.nextLine();
		// Verificaci�n de mayor�a de edad
			if (edad < mayoriaEdad) {
			System.out.println("No est� permitido su ingreso");
				} else { // Solicitar datos personales, s�lo si cumple con la mayor�a de edad
					System.out.println("Bienvenido");
					System.out.println("Por favor, ingrese su nombre");
					nombre = entrada.nextLine();
					System.out.println("Por favor, ingrese sus apellidos");
					apellido = entrada.nextLine();
					System.out.println("Por favor, ingrese su direcci�n ej: Calle 123");
					direccion = entrada.nextLine();
					System.out.println("Ingrese su numero de telefono");
					int numeroTelefono = entrada.nextInt();
					// Solicitar saldo
					System.out.println("Ingrese su saldo");
					int saldoActual = entrada.nextInt();
						if (saldoActual >= saldoMinimo) {
							System.out.println("Autorizado para apostar"); // Validar saldo, si puede o no realizar apuestas
							System.out.println("�Cuanto desea apostar?");
							int montoApuesta = entrada.nextInt();
							saldoActual = saldoActual - montoApuesta;
							System.out.println("Tu saldo actual es: " + saldoActual);
						} else {
							System.out.println("No cumple con el saldo minimo");
			}
		}
	}
}

			   