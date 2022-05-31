package com.generation.f31052022;

import java.util.List;

public class Cliente {
	
	//Atributos
	private String nombre;
	private String rut;
	private Integer id; 
	private List <Integer> numerosVentas;
	private String correo; 
	
	//Constructores
	public Cliente() {
		super();
	}

	
	public Cliente(String nombre, String rut, Integer id, List<Integer> numerosVentas, String correo) {
		super();
		this.nombre = nombre;
		this.rut = rut;
		this.id = id;
		this.numerosVentas = numerosVentas;
		this.correo = correo;
	}

	//Accesadores
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getRut() {
		return rut;
	}


	public void setRut(String rut) {
		this.rut = rut;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public List<Integer> getNumerosVentas() {
		return numerosVentas;
	}


	public void setNumerosVentas(List<Integer> numerosVentas) {
		this.numerosVentas = numerosVentas;
	}


	public String getCorreo() {
		return correo;
	}


	public void setCorreo(String correo) {
		this.correo = correo;
	}


	private void modificarDatos () {
		this.rut="12333333";
		nombre="cliente1";
	}
	
	public String datos() {
		return "los datos son los siguientes: " + "\nID = " + this.id + "\nNombre = " + this.nombre + " \nRut = " + this.rut + " \nCorreo = " + this.correo;
	
	// para acceder a un atributo privado desde otro lugar debo utilizar el get and set.
	//Get nos permite consultar por un dato.
	//Set nos permite definir datos para nuestros atributos.
}	
}	