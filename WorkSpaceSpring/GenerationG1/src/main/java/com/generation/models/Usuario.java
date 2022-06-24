package com.generation.models;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="usuarios")

public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	//size limita la cantidad de caracteres.
	@Size(min=3, max=20)
	private String nombre;
	
	@Size(min=3, max=20)
	private String apellido;
	
	private int edad;
	
	@NotNull
	@Size(min=6, max=8)
	private String password;
	
	//Atributos opcionales que sirven para la gestión de la base de datos.
	@Column(updatable=false)
	private Date createdAt;
	//Guarda automaticamente la fecha en que fue actualizado el registro.
	private Date updatedAt;
	
	 //Relaciones OneToOne (1a1)   
	 //Con cascade podemos restringir el eliminar datos y dejar relaciones incompletas. Solo puedo eliminar datos cuando rompo la relación.
	 @OneToOne(mappedBy="usuario",cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	 private Licencia licencia;
	
	//Constructores
	public Usuario() {
		super();
	}

	public Usuario(String nombre, String apellido, int edad, String password) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.password = password;

	}
	//Getters&Setters
	public Licencia getLicencia() {
		return licencia;
	}

	public void setLicencia(Licencia licencia) {
		this.licencia = licencia;
	}
	
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

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	//Funciones
	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + "]";
	}

	//Insertar en la base de datos la fecha antes de insertar.
		@PrePersist
	    protected void onCreate(){
	        this.createdAt = new Date();
	    }
	    @PreUpdate
	    protected void onUpdate(){
	        this.updatedAt = new Date();
	    }
	
	
	    
}
