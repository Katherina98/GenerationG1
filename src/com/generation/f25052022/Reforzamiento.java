package com.generation.f25052022;

import java.util.Scanner;
public class Reforzamiento {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		
		//Establecer rango superior
		System.out.println("Ingresar valor superior del rango: ");
		int rangoS = sc.nextInt();
		//Establecer rango inferior
		System.out.println("Ingresar el valor inferior del rango: ");
		int rangoI = sc.nextInt();
		sc.nextLine();
		
				
				while (rangoI > rangoS) {	
				System.out.println("El valor superior es menor al valor inferior, por favor vuelva a ingresar el valor inferior ");
				rangoI = sc.nextInt();
				}	
					System.out.println("El rango se encuentra establecido entre: " + rangoI + " a " + rangoS);
		
		int num = 0;			
		int contadorDentroRango = 0;
		int contadorFueraRango = 0;
		int contadorNumeroIgual = 0;
		boolean exit = true;	
		
		while(exit) {
  			System.out.println("Ingrese un numero en el programa");
  			num = Integer.parseInt(sc.nextLine());
  			
  			if(num == 0) {
  				exit = false;
  			
  			}else if 
  				(num<rangoS && num>rangoI) {
  				contadorDentroRango += num;
  			}
  			else if(num==rangoI || num==rangoS ) {
  				contadorNumeroIgual++;
  			}
  			else{
  				contadorFueraRango++;
  			}			
		}
		
		System.out.println("La suma de los numeros que estan dentro del rango es: " + contadorDentroRango );
	  	System.out.println("La cantidad de numeros fuera de rango es: " + contadorFueraRango);
	  	System.out.println("La cantidad de numeros iguales a uno de los margenes es: " + contadorNumeroIgual);
	}
}
			 	
	



