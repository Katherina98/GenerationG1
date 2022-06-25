package com.generation.f220525;

import java.util.Scanner;

public class CalculadoraComisiones {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		float comision1 = 0.3f;
		float comision2 = 0.2f;
		float comision3 = 0.1f;

		int venta;
		float valorResultante;
		System.out.println("Ingrese el valor de la venta obtenida");
		venta = Integer.parseInt(entrada.nextLine());

		if (venta >= 10000) {
			valorResultante = (venta * comision1);
			System.out.println("La comisi�n de la venta es de 30% equivalente a: " + valorResultante);
		} else if (venta >= 5001 && venta <= 9999) {
			valorResultante = (venta * comision2);
			System.out.println("La comisi�n de la venta es de 20% equivalente a: " + valorResultante);
		} else if (venta >= 1001 && venta <= 4999) {
			valorResultante = (venta * comision3);
			System.out.println("La comisi�n de la venta es de 10% equivalente a: " + valorResultante);
		} else {
			System.out.println("No hay comisi�n por su venta");
		}

		float descuento1, descuento2, descuentoCantidad, totalPago, descuentoFinal;
		int edadUsuario, edadDescuento1, edadDescuento2;
		int ticketNormal = 3500;
		edadDescuento1 = 15;
		edadDescuento2 = 60;
		descuentoFinal = 0f;
		// int cantidadTicket = 2;

		System.out.println("Por favor, ingrese su edad para calcular el precio final");
		edadUsuario = Integer.parseInt(entrada.nextLine());

//<= a 15 a�os
		descuento1 = (float) (ticketNormal - (ticketNormal * 0.6));

//Mayores de 60 a�os
		descuento2 = (float) (ticketNormal - (ticketNormal * 0.55));

//seg�n el total de tiket aplicando descuentos anteriores
//descuentoPorCantidad = totalPago � (totalPago*0.3);

		if (edadUsuario > edadDescuento1 && edadUsuario <= edadDescuento2) {

			descuentoFinal = (float) ticketNormal;

		} else {

			if (edadUsuario <= edadDescuento1) {

				descuentoFinal = descuento1;

			} else {

				if (edadUsuario > edadDescuento2) {

					descuentoFinal = descuento2;

				}

			}
		}

		System.out.println("Su precio final de acuerdo a su edad es: $" + descuentoFinal + " CLP");

	}

}