package com.generation.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table (name="licencias")
public class Licencia {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private Integer numero;
	
	//Para establecer el formato de la fecha
	@DateTimeFormat(pattern="yyyy-MM-dd")
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
	
	
	//Relaciones OneToOne (1a1)
	//CREACION DE FOREIGN KEY EN CLASE LICENCIA.
	
	//LAZY Cuando vayamos a buscar la licencia por default nos traera el usuario que este asociado, pero la carga de este dato lo vamos a tener cuando vayamos a consultar por el usuario (a peticion).
	//EAGER carga automaticamente el usuario asociado.
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="usuario_id") //Primary Key de la otra entidad, en este caso seria el id del usuario.
	private Usuario usuario; //Establecemos cual es el objeto donde se encuentra la Primary Key declarada en la linea anterior.
	
	
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



	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
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
