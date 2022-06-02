package com.generation.f01062022.ejercicioModelo;

public class Instrumento {

	private String nombre;
	private String material;
	private Integer tamano;
	
	
	
	public Instrumento() {
	}

	public Instrumento(String nombre, String material, Integer tamano) {
		super();
		this.nombre = nombre;
		this.material = material;
		this.tamano = tamano;
	}

	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public Integer getTamano() {
		return tamano;
	}

	public void setTamano(Integer tamano) {
		this.tamano = tamano;
	}

	@Override
	public String toString() {
		return "Instrumento [nombre=" + nombre + ", material=" + material + ", tamano=" + tamano + "]";
	}
	
	
	
	
	
}
