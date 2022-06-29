package com.generation.models;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="autos")
public class Auto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String color;
	
	@Size(min=3, max=20)
	private String marca;
	
	@NotNull
	@Size(min=3, max=15)
	private String modelo;
	
	private Double velocidad;
	private Float valor;
	
	/**ManyToMany*/ 
	//Relación con AutosVentas
	@ManyToMany(fetch=FetchType.EAGER)
	@JoinTable(
				name="autos_ventas", //Nombre de la tabla relacional (conexión entre tablas)
				joinColumns= @JoinColumn(name="auto_id"), //Primary Key de donde estamos actualmente
				inverseJoinColumns= @JoinColumn(name="compraVenta_id") //Primary Key de la otra tabla a asociar
				)
	private List<CompraVenta> comprasVentas;
	
	
	//Atributos opcionales que sirven para la gestión de la base de datos.
	@Column(updatable=false)
	private Date createdAt;
	private Date updatedAt;
	
	
	public Auto() {
		super();
	}

	public Auto(String color,String marca, String modelo, Double velocidad, Float valor) {
		super();
		this.color = color;
		this.marca = marca;
		this.modelo = modelo;
		this.velocidad = velocidad;
		this.valor = valor;
	}


	public Float getValor() {
		return valor;
	}

	public void setValor(Float valor) {
		this.valor = valor;
	}


	public List<CompraVenta> getComprasVentas() {
		return comprasVentas;
	}


	public void setComprasVentas(List<CompraVenta> comprasVentas) {
		this.comprasVentas = comprasVentas;
	}


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


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	@Override
	public String toString() {
		return "Auto [color=" + color + ", marca=" + marca + ", modelo=" + modelo + ", velocidad=" + velocidad + "]";
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
