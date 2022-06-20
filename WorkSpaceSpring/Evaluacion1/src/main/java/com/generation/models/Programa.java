package com.generation.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="programas")

public class Programa {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Size(min=3, max=20)
	private String nombre;
	
	@NotNull
	private String duracion;
	private Integer audiencia;
	
	public Programa() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDuracion() {
		return duracion;
	}

	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}

	public Integer getAudiencia() {
		return audiencia;
	}

	public void setAudiencia(Integer audiencia) {
		this.audiencia = audiencia;
	}

	@Override
	public String toString() {
		return "Programa [id=" + id + ", nombre=" + nombre + ", duracion=" + duracion + ", audiencia=" + audiencia
				+ "]";
	}	
	
}
