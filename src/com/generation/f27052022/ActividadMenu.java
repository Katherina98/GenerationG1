package com.generation.f27052022;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class ActividadMenu {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		HashMap platos = new HashMap(); 

		ArrayList<String> arroz = new ArrayList <String>();
		arroz.add("con lomo liso");
		arroz.add("con pollo al jugo");
		arroz.add("chaufá");
		
		ArrayList<String> pure = new ArrayList <String>();
		pure.add("con carne");
		pure.add("con pollo arvejado");
		pure.add("con pescado");
		
		
		platos.put("Arroz", arroz);
		platos.put("Pure", pure);
		
		System.out.println("**Menu del día**");
		System.out.println("**Arroz**");
		System.out.println(platos.get("Arroz"));
		System.out.println("**Pure**");
		System.out.println(platos.get("Pure"));
		
		System.out.println("Elija su plato");
		String plato1 = entrada.nextLine();
		System.out.println("Su orden es: " + plato1 + " tiempo de espera 30 minutos");
		System.out.println("**Gracias por su compra**");
		
		
	}
}