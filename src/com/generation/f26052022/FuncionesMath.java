package com.generation.f26052022;

public class FuncionesMath {

	public static void main(String[] args) {

		
		//Math = libreria que vamos a utilizar la cual muestra varias funciones matematicas 
		
		//Elevar o potencia (numero, exponente)
			double numeroElevado = Math.pow(2.2, 2);
			System.out.println(numeroElevado);
		//Redondear al entero mayor.	
			double enteroMayor = Math.ceil(numeroElevado);
			System.out.println(enteroMayor);
		//Redondear al entero menor.	
			double enteroMenor = Math.floor(numeroElevado);
			System.out.println(enteroMenor);
		//Redondear
			double enteroRedondeado = Math.round(numeroElevado);
			System.out.println(enteroRedondeado);
			
		//abs = valor absoluto	
			
		//numeros aleatorios >= 0.0 y <=1.0
			double aleatorio = Math.random();
			System.out.println(aleatorio);
		//Si queremos establecer un rango desde el 0 a X numero debemos multiplicar el método por ese número. 
			double aleatorio0y10 = Math.random() * 10;
			System.out.println(aleatorio0y10);
			
		//Si queremos establecer un rango desde numero X a numero X1 debemos sumar el primer numero fuera del parentesis y multiplicar el segundo menos la resta del primero en el parentesis.
			double num28 = (Math.random() * (8-2)) + 2;
			System.out.println(Math.abs(num28));
			System.out.println(Math.round(num28));
			System.out.println(Math.floor(num28));
			
			//Para trabajar con rangos entre un negativo a positivo, podemos ingresar la resta del
			double num29= (Math.random() * (4-(-4))) - 4; 
			System.out.println(num29);
			
			
	}

}
