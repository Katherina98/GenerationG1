package com.generation.f30052022;

import java.util.ArrayList;
import java.util.List;

public class ActividadAlumno {

	public static void main(String[] args) {
		
		Alumno alumno = new Alumno ("Katherina","Orellana","G1","Estudiante",26);
		Alumno alumno1 = new Alumno ("Catalina","Martinez","G1","Estudiante",25);
		Alumno alumno2 = new Alumno ("Esteban","Castañeda","G1","Estudiante",22);
		Alumno alumno3 = new Alumno ("Danko","Abarca","G1","Estudiante",25);
		Alumno alumno4 = new Alumno ("Wladimir","Rojas","G1","Estudiante",27);
	
		
		System.out.println("**********GRUPO NUMERO 4*****************");
		System.out.println("*****************************************");
		System.out.println("Para el alumno 1 " + alumno.datos());
		System.out.println("*****************************************");
		System.out.println("Para el alumno 2 " + alumno1.datos());
		System.out.println("*****************************************");
		System.out.println("Para el alumno 3 " + alumno2.datos());
		System.out.println("*****************************************");
		System.out.println("Para el alumno 4 " + alumno3.datos());
		System.out.println("*****************************************");
		System.out.println("Para el alumno 5 " + alumno4.datos());
		System.out.println("*****************************************");
		
	   //Podemos llamar al metodo toString, para visualizar los valores de los atributos que tenemos en ese momento.
		//Recordar crear esta funcion en la clase Alumno.
	   //System.out.println(alumno.toString());
				
		List<Alumno> listaAlumnosG1 = new ArrayList <Alumno>();
		
		listaAlumnosG1.add(alumno);
		listaAlumnosG1.add(alumno1);
		listaAlumnosG1.add(alumno2);
		listaAlumnosG1.add(alumno3);
		listaAlumnosG1.add(alumno4);
		
		System.out.println("\n<<<<<<Lista de los alumnos grupo 4>>>>>>>");
		for (int i = 0; i < listaAlumnosG1.size(); i++) {
			System.out.println(listaAlumnosG1.get(i));
		}
		System.out.println("<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>");
	}

}
