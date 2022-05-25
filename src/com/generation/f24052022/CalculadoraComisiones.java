package com.generation.f24052022;

import java.util.Scanner;

public class CalculadoraComisiones {
		
	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		
		 System.out.println("Ingrese el valor de la venta obtenida");
		 int venta = (sc.nextInt());
		 
		if (venta >= 10000) {
			 System.out.println("La comisión de la venta es de 30% equivalente a :" + venta * 0.3);
		}	 
		if (venta >= 5001 && venta <= 9999)	{
			System.out.println("La comisión de la venta es de 20% equivalente a :" + venta * 0.2);
		}	
		if (venta == 5000 || venta <= 1000) {
			 System.out.println("No hay comisión por su venta");
		}	 
		if (venta >= 1001 && venta <= 4999) {
			System.out.println("La comisión de la venta es de 10% equivalente a :" + venta * 0.1);
		}		  
	}
   }
