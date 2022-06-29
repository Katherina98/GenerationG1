package com.generation.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="autos_ventas")
public class AutoVenta {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private Integer cantidad;
	private Float subtotal;
	private Date fechaCompra;
	
	
	/**ManyToMany = 2 ManyToOne*/
	//Relación con auto (ManyToOne)
		@ManyToOne(fetch=FetchType.LAZY)
		@JoinColumn(name="auto_id") 
		private Auto auto; 
	
	//Relación con compraVenta (ManyToOne)
		@ManyToOne(fetch=FetchType.LAZY)
		@JoinColumn(name="compraVenta_id") 
		private CompraVenta compraventa;

		
		public AutoVenta(Integer cantidad, Float subtotal, Date fechaCompra) {
			super();
			this.cantidad = cantidad;
			this.subtotal = subtotal;
			this.fechaCompra = fechaCompra;
		}


		public Long getId() {
			return id;
		}


		public void setId(Long id) {
			this.id = id;
		}


		public Integer getCantidad() {
			return cantidad;
		}


		public void setCantidad(Integer cantidad) {
			this.cantidad = cantidad;
		}


		public Float getSubtotal() {
			return subtotal;
		}


		public void setSubtotal(Float subtotal) {
			this.subtotal = subtotal;
		}


		public Date getFechaCompra() {
			return fechaCompra;
		}


		public void setFechaCompra(Date fechaCompra) {
			this.fechaCompra = fechaCompra;
		}


		public Auto getAuto() {
			return auto;
		}


		public void setAuto(Auto auto) {
			this.auto = auto;
		}


		public CompraVenta getCompraventa() {
			return compraventa;
		}


		public void setCompraventa(CompraVenta compraventa) {
			this.compraventa = compraventa;
		} 
	
	
	
	
}
