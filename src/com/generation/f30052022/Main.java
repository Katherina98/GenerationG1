package com.generation.f30052022;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		//instancia de una clase
		//Invocamos un objeto dentro de otra clase.
		//Podemos colocar este objeto y crear una variable dentro de ella. 
		
		//llamamos al constructor para asignar valores a nuestros atributos.
		//en el caso de utilizar el constructor vacio, significa que a posterior vamos a ingresar datos.
		Alumno alumno = new Alumno ();
		//en el caso de utilizar el constructor con parametros, significa que vamos a ingresar datos en los atributos.
		Alumno alumno2 =  new Alumno ("Katherina","Orellana","G1","Estudiante",26);
		
		//GETTER se utiliza para obtener el atributo que pudiese tener asignado mi variable. 
		System.out.println(alumno.getNombre()); //en este caso la variable nombre esta vacia, por lo que retorna "null"
		System.out.println(alumno2.getNombre()); //en este caso la variable tiene un dato asignado, por lo que retorna "Leonardo"
		
		//SETTER nos permite cambiar el contenido de la variable.
		alumno.setNombre("Scarlett");
		
		List<Alumno> listaAlumnos = new ArrayList <Alumno>();
		
		listaAlumnos.add(alumno2);
		listaAlumnos.add(alumno);
		
		for (Alumno objetoAlumno : listaAlumnos) {
			System.out.println(listaAlumnos);
			System.out.println(objetoAlumno.getNombre());
			System.out.println(objetoAlumno.getCurso());
			System.out.println("**********.");
			System.out.println(objetoAlumno.toString());
			System.out.println("**********");
		}
	
		System.out.println("***************----*");
		for (int i = 0; i < listaAlumnos.size(); i++) {
			System.out.println(listaAlumnos.get(i)); //estamos accediendo a un objeto con get.
			System.out.println(listaAlumnos.get(i).getNombre());
		}
		
		
		//interfaz solo definen los métodos 
		//clase arraylist define los métodos, atributos. 
		
		
	}
	
		
	}


