package com.generation.f27052022;

public class Auto {
	/*Clase: es un modelo o prototipo. 
	El objeto nace a partir de la clase. 
	Tiene caracteristicas o atributos, metodos o funciones.
	Algo concreto lo convertimos en algo abstracto (no tangible) 
	Tangible: cuando utilizamos nuestros 5 sentidos para describirlo. 
	
	La funcion es la que se encargar de modificar el atributo.
	
	//Atributo de colaboración 
	
	*/

	//Orden para la creación de objetos (como buena practica) 
	//Atributo
	//Primero debemos definir la accesibilidad del atributo, luego el tipo de dato y el nombre del atributo quedando:
	//Accesador + tipo de dato + nombre atributo ;
	//Los atributos siempre deben ir en private
	private String color;
	private String marca;
	private String modelo;
	private Double velocidad;
	
	//Constructores
	//Nos permite agregar valores a nuestros atributos
	//Nos sirve para cuando queramos crear una instacia
	//Para agregar un constructor debemos dar chic derecho > source > generate constructor using fields...
	
	//Constructor vacio, sin atributos.
		public Auto() {
			super();
		}
	
	//Constructor con parametros
	public Auto(String color, String marca, String modelo, Double velocidad) {
		super();
		this.color = color;
		this.marca = marca;
		this.modelo = modelo;
		this.velocidad = velocidad;
	}	
	//Accesadores y mutadores (get y set)

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Double getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(Double velocidad) {
		this.velocidad = velocidad;
	}
		
	
	//Metodos o funciones personalizadas
	//Las funciones creadas dentro de un objeto no llevan "static". 
	public void aumentarVelocidad() {
		this.velocidad = 10d;
		
	}
	
	
			
	
	
	

}
