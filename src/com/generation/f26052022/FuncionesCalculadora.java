package com.generation.f26052022;
	import java.util.Scanner;

		public class FuncionesCalculadora {

			public static void main(String[] args) {
				
		   Scanner sc = new Scanner(System.in); 
		    int resultado=0;
			int opcion=0;
		    
		    System.out.println("******************************\n");
			System.out.println("Calculadura Generation 3000");
			System.out.println("******************************\n");
		    
		    System.out.println("Ingrese el primer numero: ");
		    int num1 = Integer.parseInt(sc.nextLine());

		    System.out.println("Ingrese el segundo numero: ");
		    int num2 = Integer.parseInt(sc.nextLine());
		    
		    do{
		    System.out.println("Ingrese opcion:\n1 Sumar \n2 Restar \n3 Multiplicar \n4 Dividir \n5 Modulo");
		  	opcion = Integer.parseInt(sc.nextLine()); //capturando el ingreso de datos
		    }while(opcion<1 || opcion>5);
				
			switch(opcion){
		      case 1:
		          resultado = suma(num1,num2);
		          break;
		      case 2:
		          resultado = restaNumeros(num1, num2);
		          break;
		      case 3:
		          resultado = multiplicacion(num1,num2);
		          break;
		      case 4:
		          resultado = division(num1, num2);
		          break;
		      case 5:
		          resultado = modulo(num1, num2);
		          break;        
		    }
		    
		    System.out.println("El resultado es: "+resultado);
		    
			}

		//multiplicacion
			public static int multiplicacion(int numero1, int numero2) {
				return (numero1 * numero2);
			}

		//Resta 
			public static int restaNumeros(int num1, int num2) {
				int resta = num1 - num2;
				return resta;
			}

		//divisi�n
			public static int division(int num1, int num2) {
				int total = (num1 / num2);
				return total;
			}

		//Modulo
			public static int modulo(int num1, int num2) {
				int modulo = num1 % num2; 
				return modulo;

			}
		//Suma
			public static int suma (int num1,int num2) {
			int suma = num1 + num2;
			return suma;
			}
		}