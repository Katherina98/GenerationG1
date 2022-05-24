package com.generation.f23052022;

public class Main {

	public static void main(String[] args) {
		//Variables
		//Se define el tipo de dato al cual pertenecera la variable: puede ser texto, numerica,
		
		//VARIABLE DE TEXTO
		//Tipo_dato nombre_variable = asignacion;
		String Apellido = "Orellana\" \n linea nueva";
		System.out.println(Apellido);
		System.out.println(Apellido + 98);
		
		//VARIABLE NUMERICA
		//Tipo_dato nombre_variable = asignacion; 
		//Podemos ingresar como maximo valor 32 bits (-2^ a 2^31 -1).
		int numeroInt = 2147483647; 
		System.out.println(numeroInt);
		System.out.println(numeroInt + 10);
		
		//Podemos ingresar como maximo valor 8 bits (-128 a 127).
		byte numeroByte = 127;
		System.out.println(numeroByte);
		
		//Podemos ingresar como maximo valor 16 bits (-32768 a 32767.
		short numeroShort = 32767;
		System.out.println(numeroShort);
		
		//Podemos ingresar como maximo valor 64 bits (-2^63 a 2^63 -1)
		long numeroLong = 2147483647;
		System.out.println(numeroLong);
		
		//True o False
		boolean acepta = true;
		boolean noAcepta = false; 
		
		//float numeroFloat = ;
		//double numeroDouble = ;
		//ambas variables aceptan decimales, variables primitivas.
		

		//16 bits. Debemos ingresar solo un caracter entre comillas simples. 
		char letraA = 'a';
		System.out.println(letraA);
		
		//Para sobreescribir una variable debemos escribirla sin el tipo_variable antes del nombre_variable. 
		
		//Actividad
		String Genero = "Femenino"; 
		System.out.println(Genero);
		
		char GeneroF = 'F';
		System.out.println(GeneroF);
		char GeneroM= 'M';
		System.out.println(GeneroM);
		
		
		String ColorCabello = "Castaño";
		System.out.println(ColorCabello);
		
		
		boolean Comprometido = true;
		boolean NoComprometido = false; 
		
		if (Comprometido == true & NoComprometido != true) {
			System.out.println("Estoy comprometida");
		} else { 
			System.out.println("No estoy comprometida");
		}
		
		
		int Poblacion = 200;
		int Edad1 = 24;
		String Nombre = "Katherina"; 
		String Ocupacion = "Estudiante";
		
		System.out.println(Ocupacion);
		System.out.println(Nombre);
		
		//VARIABLES OBJETO
		String Velocidad = "100 m/s";
		//En este caso podemos recibir un valor segun la posicion en la que se encuentre.
		// "100 m/s" donde el valor 4 es la posicion de la letra "m".
		System.out.println(Velocidad.charAt(4)); 
		
		//Para comparar STRING debemos colocar ".equals"
		String Curso = "G1";
		if (Curso.equals("g1")) {
		System.out.println("Iguales"); 
		} else {
		System.out.println("Distintos");	
		}
		
		//Para comparar STRING pero sin diferenciar entre mayusculas o minusculas, solor reviso el contenido.
		if (Curso.equalsIgnoreCase("g1")) {
		System.out.println("Iguales"); 
		} else {
		System.out.println("Distintos");	
		}
		
		//Tambien podemos combinar procesos 
		if (Curso.toLowerCase().equals("g1")) {
			System.out.println("Iguales"); 
		} else { 
		System.out.println("Distintos");	
		}
				
		if (Curso.equals("g1".toUpperCase())) {
			System.out.println("Iguales"); 
		} else {
		System.out.println("Distintos");	
		}

		String curso2 = "";  //Variable vacia
		String curso3 = null; //Variable null 
		
		Curso.indexOf(1);
		Curso.isBlank();
		Curso.isEmpty();
		
		//Para comparar un STRING con un NULL debemos utilizar el == 
		if (curso3 == null) {
		System.out.println("si se puede");	
		}
		
		if (curso2.isEmpty()) {
			System.out.println("intento1");
		} else {
			System.out.println("intento2");
		}
		
		//float sin mayuscula al inicio es una variable de tipo primitivo, no nos da opciones. 
		float altura1 = 1.55f; 
		
		//CAST, nos permite convertir un dato a otro tipo de dato.
		double altura = 1.55; 
		
		//Float con mayuscula al inicio es una variable de tipo objeto. si colocamos la variable y un punto nos da opciones.
		Float peso = 70f; 
		
		//Parse.: convertir un String a un tipo de numero.
		// Integer.parseInt("23")
		//Long.parseLong("123456787654")
		//Float.parseFloat("85.5")
		//Double.parseDouble("123245.56")
		
		
		
		String numeroEj = "10"; 
		System.out.println(Long.parseLong(numeroEj));		
		System.out.println(Float.parseFloat(numeroEj));
		System.out.println(Double.parseDouble(numeroEj));
		System.out.println(Integer.parseInt(numeroEj));
		
		//Conversion automatica debe ser de menor a mayor. 
		// byte > short > int > long > float > double
		
		int num1 = 18; 
		float num1f = num1;
		System.out.println(num1 +" "+ num1f);
		
		//Conversion manual debe ser de mayor a menor.
		// double < float < long < int < short < byte
		
		Double peso2 = 75.9;
		Float.valueOf(peso2.toString());
		
		Double peso3 = 70.5;
		Float peso3F = peso3.floatValue(); 
		String peso3S = peso3.toString();
		System.out.println(peso3F);
		System.out.println(peso3S);
		
		
		//Debemos considerar que un valor con +1 decimal es un Double
		//Si transformamos de un Float a un Integer o de float a int, perdemos los decimales y no se realiza aproximacion
		//ej si tenemos 70.9 y lo transformamos a 70 no 71.
		
		//Operadores : + - * / %
		//Comparacion : == != < <= > >= 
		
		if (5 == (3+2)) {
			
		}
	
		int dos = 2;
		int tres = 3;
		if (5 == (tres + dos)) {
			
		}	
	  }	
	}
		

