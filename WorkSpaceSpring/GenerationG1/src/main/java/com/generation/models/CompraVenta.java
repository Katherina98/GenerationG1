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
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;

import org.hibernate.validator.constraints.Range;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="comprasVentas")
public class CompraVenta {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date fecha;
	
	@Range(min=0)
	private Float monto;

	//ManyToOne
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="cliente_id") //Primary Key de la otra entidad, en este caso seria el id del usuario.
	private Cliente cliente; //Establecemos cual es el objeto donde se encuentra la Primary Key declarada en la linea anterior.
	
	/**ManyToMany*/ 
	//Relación con AutosVentas
	@ManyToMany(fetch=FetchType.EAGER)
	@JoinTable(
				name="autos_ventas", //Nombre de la tabla relacional (conexión entre tablas)
				joinColumns= @JoinColumn(name="compraVenta_id"), //Primary Key de donde estamos actualmente
				inverseJoinColumns= @JoinColumn(name="auto_id") //Primary Key de la otra tabla a asociar
				)
	private List<Auto> autos;
	
	
	
	//Atributos opcionales que sirven para la gestión de la base de datos.
	@Column(updatable=false)
	private Date createdAt;
	private Date updatedAt;
	
	public CompraVenta() {
	}
	
	public CompraVenta(Date fecha, @Range(min = 0) Float monto) {
		super();
		this.fecha = fecha;
		this.monto = monto;
	}

	
	public List<Auto> getAutos() {
		return autos;
	}

	public void setAutos(List<Auto> autos) {
		this.autos = autos;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Float getMonto() {
		return monto;
	}

	public void setMonto(Float monto) {
		this.monto = monto;
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
