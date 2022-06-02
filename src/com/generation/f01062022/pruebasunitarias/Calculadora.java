package com.generation.f01062022.pruebasunitarias;

public class Calculadora {

	public int suma(int num1, int num2) {
		return num1 + num2;	
	}
	public int resta(int num1, int num2) {
		return num1 - num2;	
	}
	public int multiplicacion(int num1, int num2) {
		return num1 * num2;	
	}
	public String division(int num1, int num2) {
		if (num2 != 0) {
			String resultado = Integer.toString(num1/num2);
			return resultado;
		} 
		return "No se puede dividir por 0";
	}

	public String numPar(int num1) {
		if (num1 % 2 == 0) {
			String respuesta = "numero par";
			System.out.println(respuesta);
		}
		return "numero impar";
		
	}

	
	public String numImpar(int num1, int num2) {
		if ((num1/ num2) % 2 != 0) {
			String respuesta = "numero Impar";
			System.out.println(respuesta);
		}
		return "numero par";
	}
	
	public String numeroPar(int num1, int num2) { 	
		if((num1/num2)%2 == 0){ 		
			String resultado = "Es par"; 		
			return resultado; 		
			} 	
		return "No se puede dividir por dos, es impar"; 
	}
	
	
	
	}
