package com.generation.f30052022;

public class Alumno {

	//Atributos (regularmente son singulares, a excepción de que sea un hashmap o un arraylist)
	//Protected o public 
	//Protected podemos acceder todos los que esten dentro del package, no solo la clase. 
	//Public, cualquier puede acceder desde cualquier parte.
	//Private permite trabajar con uno de los cuatro pilares de Java "la encapsulación". 
	//Private porque solo podemos acceder dentro de la misma clase. Proteger la información, no cualquiera puede tener acceso.
	
	private String nombre;
	private String apellido;
	private String curso;
	private int edad; 
		
	//Constructor
	public Alumno() {
		super();
	}
	
	public Alumno(String nombre, String apellido, String curso, String ocupacion, int edad) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.curso = curso;
		this.edad = edad;
	}

	//Accesador
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}


	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	
	//Funciones
		
	public String datos() {
		return "los datos son los siguientes: " + "\nNombre = " + this.nombre + " \nApellido = " + this.apellido + " \nCurso = " + this.curso + " \nEdad = " + this.edad;
		
		
	}

	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", apellido=" + apellido + ", curso=" + curso + ", edad=" + edad + "]";
	}
	
	
	
	
				
	}

		
	
	
	
	

