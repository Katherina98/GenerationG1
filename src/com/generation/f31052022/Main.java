package com.generation.f31052022;


import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.generation.f31052022.manager.ClienteManager;

public class Main {

	public static void main(String[] args) {
		//Para poder ingresar datos en la consola.
		Scanner sc = new Scanner(System.in);
		
		//Arreglo de clientes (lista).
		List <Cliente> listaClientes = new ArrayList <Cliente>();
		int opcion = 0;
		
		//Instanciamos al objeto cliente, por default se crea el constructor vacio si es que no se ha creado uno en el objeto.
		//En la clase objeto se debe crear el constructor con parametros si queremos establecerlos.
		Cliente cliente1 = new Cliente();
		
		//Ingreso de datos estaticos
		//cliente1.setId(1234);
		//cliente1.setNombre("Ana");		
		//cliente1.setRut("123456789-0");
		
		do { 
		//Excepciones, ingreso de datos dinamicos
		Cliente clienteDatosDinamicos = new Cliente();

		System.out.println("Ingrese el id de Cliente");
		///Integer id2 = sc.nextInt();
		String idString = sc.nextLine();

		try {
			Integer id = Integer.parseInt(idString);
			clienteDatosDinamicos.setId(id);
					
			//nombre
			System.out.println("Ingrese el nombre de Cliente");
			String nombre = sc.nextLine();
			clienteDatosDinamicos.setNombre(nombre);
			// rut
			System.out.println("Ingrese el rut de Cliente");
			String rut = sc.nextLine();
			clienteDatosDinamicos.setRut(rut);
			// correo
			System.out.println("Ingrese el correo de Cliente");
			String correo = sc.nextLine();
			clienteDatosDinamicos.setCorreo(correo);
			
			//mostrar los datos obtenidos
			System.out.println("\n******************************");
			System.out.println("Los datos ingresados son: " + "\nID = " + idString + "\nNombre = " + nombre + "\nRut = " + rut + "\nCorreo = " + correo);
			System.out.println("******************************");
			
			//Integer division = 100/0;
			System.out.println("\nPara finalizar el proceso, ingrese dos numeros para generar una division. El resultado sera su codigo de activacion de cuenta");
			System.out.println("Ingresar numero 1");
			int num1 = sc.nextInt();
			System.out.println("Ingresar numero 2");
			int num2 = sc.nextInt();
			
			Integer division = num1/num2;
			System.out.println("El resultado de la division es: " + division);
			System.out.println("Recuerde guardar este numero para su activacion, que tenga buen dia.");
			System.out.println("*******************************");
			
			
			//Excepciones, errores que pueden ocurrir y el mensaje que le enviamos al usuario. 
		} catch (ArithmeticException ae) {
			System.out.println("Error al dividir por 0");
		} catch(NullPointerException npe) {
			System.out.println("No se puede realizar la operacion matematica, un dato es nulo");
		} catch (InputMismatchException ime) {
			System.out.println("Error en el ingreso de un dato");
		} catch (NumberFormatException nfe) {
			System.out.println("No puede ingresar un letra como identificador, cliente queda invalido " + nfe);
		} catch (Exception e) {
			System.out.println("Ha ocurrido un error, contecte al administrador " + e);
		}
		
		//Agregar el cliente ingresado a la lista.
		listaClientes.add(clienteDatosDinamicos);
		
			do {
			System.out.println("¿Desea ingresar otro cliente? (1) SI   (2) NO ");
			opcion = sc.nextInt();
			} while (opcion <0 || opcion >2);
		
		sc.nextLine();
		} while (opcion == 1);
	
		//Acceder al metodo de otra clase para ello debemos crear la instacia. 
		ClienteManager cm = new ClienteManager ();
		//con la nueva variable creada llamamos al metodo.
		cm.recorrerArregloCliente(listaClientes);
		
		
		
	}
}
