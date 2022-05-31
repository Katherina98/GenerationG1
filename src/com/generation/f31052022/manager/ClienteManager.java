package com.generation.f31052022.manager;

import java.util.List;

import com.generation.f31052022.Cliente;

//logica de negocio 
//validaciones
public class ClienteManager {

	//funcion que permita recorrer el arreglo e imprimir
	
	public void recorrerArregloCliente (List <Cliente> listaClientes) {
		
		System.out.println("\nBienvenido a la lista de clientes");
		//System.out.println("Usuarios null son invalidos");
		
			for (Cliente clientes : listaClientes) {
			System.out.println("\n********************************");
			System.out.println(clientes.datos());
			System.out.println("********************************");
			
		}
	}
}

