package com.generation.f26052022;

import java.util.Scanner;

public class Funciones {

	public static void main(String[] args) {
		//Funciones, vamos a definir 4 tipos. 
		// 2 funciones que retornan 
		// 2 funciones que no retornan
		//Las funciones de tipo void no retornan, solo ejecutan
		//El nombre de la función se escribe con minuscula la primera letra, si son palabras compuestas las siguientes inician con mayuscula.
		//En los parametros siempre debemos definir el tipo de parametro que utilizare ej: tipo String, int, Integer, float, entre otros.
		//No podemos crear un metodo dentro de otra funcion, pero si podemos llamarlo. 
		
		saludos();

		calculoSumaPares(1, 2, "3", true, 44l);
		
		int edad1 = obtenerEdad1();
		System.out.println(edad1);
		
		int edad = obtenerEdad();
		System.out.println(edad);
		
		boolean mayorOmenor = validarMayorEdad(edad);
		System.out.println(mayorOmenor);
		
		if (mayorOmenor) {
			System.out.println("Puede ingresar al curso");
		} else {
			System.out.println("No tiene la edad suficiente para acceder al curso");
		}
		
		
		//Para capturar los valores debemos crear una variable según el tipo de variable que sea, por ej: boolean con Boolean o int con Integer.
		
	}
	//Funcion 1: no retorna nada, solo ejecuta código (le puedo definir parametros)
	//accesador // tipo_retorno // nombre_funcion(definicion de parametros a recibir) //
	public static void calculoSumaPares (int num1, Integer num2, String num3, boolean verdad, Long num4) {	
		
		//Si casteo de String a Integer, solo se realiza en la operación donde realice el parseInt. En el resto del codigo la funcion queda como String.
		System.out.println(num1 + num2 + Integer.parseInt(num3));
		
		//Si queremos que el String quede en el resto de código casteado debemos declarar una nueva variable.
		//Integer numero3 = Integer.parseInt(num3)
		//System.out.println(num1 + num2 + numero3);
	}
	//Funcion 2: no retorna nada, solo ejecuta código (no le defino parametros)
	public static void saludos () {
		//solicitar el ingreso de datos
		System.out.println("Buenos días");
	}
	
	//Funcion 3: retorna un dato, puedo no definir parametros.
	//funciones que retornan un tipo de dato
	public static Integer obtenerEdad() {
		return 21;	
	}
	
	public static Integer obtenerEdad1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese su edad");
		Integer edad = sc.nextInt();
		return edad; //retornar el contenido de la variable
	}
	//Funcion 4: retorna un dato, puedo definir parametros.
	public static Boolean validarMayorEdad (Integer edad) {
		if (edad >= 18) {
			System.out.println("es mayor de edad");
			return true;
		} else {
			System.out.println("es menor de edad");
			return false;
		}
		
		
		
		
		
	
	}
	
	
}
