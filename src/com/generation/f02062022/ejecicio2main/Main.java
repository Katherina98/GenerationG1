package com.generation.f02062022.ejecicio2main;

import com.generation.f02062022.ejercicio2modelos.Administrador;
import com.generation.f02062022.ejercicio2modelos.Secretariado;
import com.generation.f02062022.ejercicio2modelos.Trabajador;

public class Main {

	public static void main(String[] args) {
		
		Trabajador trabajador = new Trabajador ();
		Trabajador trabajador1 = new Trabajador ();
		
		trabajador.setDireccionSede("Pereira 1223");
		trabajador.setNombreJefe("Enrique Perez");
		trabajador.setnPiso(10);
		
		trabajador1.setDireccionSede("Pereira 1223");
		trabajador1.setNombreJefe("Mariana Muñoz");
		trabajador1.setnPiso(9);
		
		System.out.println("*********Empleado nuevos**********");
		System.out.println("El trabajador nuevo 1 " + trabajador.areaQuePertenece(10));
		System.out.println("El trabajador nuevo 2 " + trabajador1.areaQuePertenece(9));
		
		
		//Instancia de secretario.
		Secretariado secretario = new Secretariado ();
		Secretariado secretario1 = new Secretariado ();
		
		//Informacion secretario
		secretario.setDireccionSede("Pereira 1223");
		secretario.setNombreJefe("Mariana Muñoz");
		secretario.setnPiso(9);
		secretario.setCantLlamados(10);
		secretario.setCantReuniones(5);
		secretario.setIngles(true);
		secretario.setOrganizarAgenda(true);
		//Informacion secretario1
		secretario1.setDireccionSede("Pereira 1223");
		secretario1.setNombreJefe("Mariana Muñoz");
		secretario1.setnPiso(9);
		secretario1.setCantLlamados(5);
		secretario1.setCantReuniones(1);
		secretario1.setIngles(false);
		secretario1.setOrganizarAgenda(true);
		
		//Metodos para comprobacion
		System.out.println("\n*******Evaluacion del personal secretariado**********");
		System.out.println("El secretario 1 " + secretario.cumpleRequisitos(true, true));
		System.out.println("El secretario 2 " +secretario1.cumpleRequisitos(false, true));
		System.out.println("\n***Cantidad de trabajo asignado a los secretarios***");
		System.out.println("Para el secretario 1 la cantidad de llamados y reuniones asignadas son " + secretario.llamadosYreuniones(10, 5));
		System.out.println("Para el secretario 2 " + secretario1.llamadosYreuniones(5, 1));
		
		//Instancia de administrador.
		Administrador administrador = new Administrador ();
		Administrador administrador1 = new Administrador ();
		
		//Informacion administrador
		administrador.setCantFacturas(15);
		administrador.setCantNominas(10);
		administrador.setDireccionSede("Pereira 1223");
		administrador.setNombreJefe("Enrique Perez");
		administrador.setnPiso(10);
		administrador.setMatematicas(true);
		administrador.setRevisionPresupuestos(true);
		//Informacion administrador1
		administrador1.setCantFacturas(5);
		administrador1.setCantNominas(8);
		administrador1.setDireccionSede("Pereira 1223");
		administrador1.setNombreJefe("Enrique Perez");
		administrador1.setnPiso(10);
		administrador1.setMatematicas(true);
		administrador1.setRevisionPresupuestos(false);
		
		
		//Metodos para comprobacion
		System.out.println("\n*******Evaluacion del personal administracion**********");
		System.out.println("El administrador 1 " + administrador.cumpleRequisitos(true, true));
		System.out.println("El administrador 2 " + administrador1.cumpleRequisitos(true, false));
		System.out.println("\n***Cantidad de trabajo asignado a los administradores***");
		System.out.println("Para el administrador 1 la cantidad de nominas y facturas asignadas son " + administrador.nominasYfacturas(10, 15));
		System.out.println("Para el administrador 2 la cantidad de nominas y facturas asignadas son " + administrador1.nominasYfacturas(8, 5));
		
		//Visualizacion de la información.
		System.out.println("\n***************************************");
		System.out.println("*****Informacion Administradores****");
		System.out.println(administrador.toString());
		System.out.println(administrador1.toString());
		System.out.println("***************************************");
		System.out.println("\n*******Informacion Secretarios*******");
		System.out.println(secretario.toString());
		System.out.println(secretario1.toString());
		System.out.println("***************************************");
		System.out.println("\n***Informacion Nuevos trabajadores***");		
		System.out.println(trabajador.toString());
		System.out.println(trabajador1.toString());
		System.out.println("***************************************");
		
		Trabajador secretario3 = new Secretariado();
		secretario3.setnPiso(10);
		
		Secretariado nuevoSecretario3 = new Secretariado();
		nuevoSecretario3.setCantLlamados(20);
		System.out.println("\nEl nuevo secretario tiene asignado " + nuevoSecretario3.getCantLlamados() + " llamados por realizar");
	}

}
