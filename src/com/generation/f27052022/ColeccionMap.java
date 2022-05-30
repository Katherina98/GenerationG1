package com.generation.f27052022;

import java.util.ArrayList;
import java.util.HashMap;

public class ColeccionMap {

	public static void main(String[] args) {
		/*MAP 
		Pares de clave <-> valor
		K = key o clave; V = value o valor
		1ra forma de escribirlo: HashMap<K, V> map = new HashMap<K, V>(); 
		En esta forma debemos establecer el tipo de dato que ira en clave y valor
		Dado esto, nos vemos limitados al tipo de dato que podemos ingresar.
		2da forma de escribirlo: HashMap mapa = new HashMap();
		En esta forma no debemos establecer el tipo de dato, se asume que sera objeto.
		Dado esto, no nos vemos limitados a lo que podemos ingresar. 
		
		OBJETOS = INTEGER, STRING, FLOAT, DOUBLE.
		Clase mayor, cuando no tengamos idea de que tipo es el dato, se asume que es objeto. 
		
		EL HASHMAP ES LO MAS CERCANO QUE TENDREMOS A UNA API
		*/
		
		//HashMap<String, String> objHashMap = new HashMap<>();
		HashMap objHashMap = new HashMap(); 
		
		//Para agregar objetos dentro del mapa.
		objHashMap.put("Nombre", "Katherina"); 
		objHashMap.put("Apellido1", "Orellana");
		objHashMap.put("Apellido2", "Silva");
		objHashMap.put("edad", "24");
		
		//Elementos del mapa.
		System.out.println("Elementos del mapa: ");
		System.out.println(objHashMap);
		
		//Para acceder a un valor debemos obtenerlo a través de la clave.
		//Ya no trabajamos con posiciones, ahora solo con clave y valor.
		System.out.println(objHashMap.get("Apellido2"));
		
		//Para eliminar un par (clave <-> valor).
		objHashMap.remove("edad"); 
		System.out.println(objHashMap);
		
		//Para visualizar todas las claves o keys disponibles.
		System.out.println(objHashMap.keySet());
		//Para visualizar todos los valores o values disponibles.
		System.out.println(objHashMap.values());
		
		ArrayList<String> vocales = new ArrayList <String>();
		vocales.add("a");
		vocales.add("e");
		vocales.add("i");
		vocales.add("o");
		vocales.add("u");
		
		objHashMap.put("vocales", vocales); 
		System.out.println(objHashMap);
		
		//Si la key o clave no es la misma que ingresamos en el HashMap, nos retorna un null.
		System.out.println(objHashMap.get("Vocales"));
	
		//Para recorrer el HashMap con la opción 1 debemos utilizar: 
		/*for(String clave : objHashMap.keySet()) {
		}
		*/
		
		System.out.println("****************************************");
		//Para recorrer el HashMap con la opción 2 debemos utilziar
		for(Object clave : objHashMap.keySet()) {
			System.out.println("Clave: " +clave + " / Valor:" + objHashMap.get(clave));
			}
	
		
		
	}

}
