package com.generation.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;

@Entity
@Table (name="licencias")
public class Licencia {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private Integer numero;
	private Date fechaVencimiento;
	private String clase;
	private String estado;
	
	//Atributos opcionales que sirven para la gestión de la base de datos.
	
	//Guarda automaticamente la fecha en que fue insertado el registro.
	//Esta columna en especifico nunca se va a actualizar.
	@Column(updatable=false)
	private Date createdAt;
	//Guarda automaticamente la fecha en que fue actualizado el registro.
	private Date updatedAt;
	


	
	//eliminacion logica: no borramos, solo cambiamos el estado (dado de baja).
	//eliminacion fisica: borramos el registro.
	
	
	public Licencia() {
		super();
	}

	public Licencia(Long id, Integer numero, Date fechaVencimiento, String clase, String estado) {
		super();
		this.id = id;
		this.numero = numero;
		this.fechaVencimiento = fechaVencimiento;
		this.clase = clase;
		this.estado = estado;
	}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public Integer getNumero() {
		return numero;
	}



	public void setNumero(Integer numero) {
		this.numero = numero;
	}



	public Date getFechaVencimiento() {
		return fechaVencimiento;
	}



	public void setFechaVencimiento(Date fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}



	public String getClase() {
		return clase;
	}



	public void setClase(String clase) {
		this.clase = clase;
	}



	public String getEstado() {
		return estado;
	}



	public void setEstado(String estado) {
		this.estado = estado;
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
