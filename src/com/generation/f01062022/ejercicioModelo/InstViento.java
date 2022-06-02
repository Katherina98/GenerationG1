package com.generation.f01062022.ejercicioModelo;

public class InstViento extends Instrumento {

	private String tipoBoquilla;
	private Integer cantidadAberturas;
	
	public InstViento() {
		
	}
	
	public InstViento(String tipoBoquilla, Integer cantidadAberturas) {
		super();
		this.tipoBoquilla = tipoBoquilla;
		this.cantidadAberturas = cantidadAberturas;
	}

	public String getTipoBoquilla() {
		return tipoBoquilla;
	}

	public void setTipoBoquilla(String tipoBoquilla) {
		this.tipoBoquilla = tipoBoquilla;
	}

	public Integer getCantidadAberturas() {
		return cantidadAberturas;
	}

	public void setCantidadAberturas(Integer cantidadAberturas) {
		this.cantidadAberturas = cantidadAberturas;
	}

	@Override
	public String toString() {
		return "InstViento [tipoBoquilla=" + tipoBoquilla + ", cantidadAberturas=" + cantidadAberturas + super.toString() + "]";
	}
	
	
	
	
}
