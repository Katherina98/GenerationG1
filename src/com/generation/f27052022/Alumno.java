package com.generation.f27052022;

public class Alumno {

	//Atributos 
	private String nombre;
	private String apellido;
	private String curso;
	private String ocupacion;
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
		this.ocupacion = ocupacion;
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

	public String getOcupacion() {
		return ocupacion;
	}

	public void setOcupacion(String ocupacion) {
		this.ocupacion = ocupacion;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	
	//Funciones
		public void ocupacion() {
			this.ocupacion = "estudiar";
				
	}

		
	
	
	
	
}
