package com.generation.models;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;

@Entity
@Table(name="clientes")
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nombre;
	private String apellido;
	private String correo;
	
	//OneToMany
	@OneToMany
	(mappedBy="cliente",cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	 private List<CompraVenta> comprasVentas; //asociamos una lista
	
	//Atributos opcionales que sirven para la gestión de la base de datos.
	@Column(updatable=false)
	private Date createdAt;
	private Date updatedAt;
	
	
	public Cliente() {
	}

	public Cliente(String nombre, String apellido, String correo) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.correo = correo;
	}

	public List<CompraVenta> getComprasVentas() {
		return comprasVentas;
	}

	public void setComprasVentas(List<CompraVenta> comprasVentas) {
		this.comprasVentas = comprasVentas;
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

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
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
