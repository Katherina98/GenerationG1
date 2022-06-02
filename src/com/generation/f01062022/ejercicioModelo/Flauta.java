package com.generation.f01062022.ejercicioModelo;

public class Flauta extends InstViento {
	
	private String nombreModelo;
	private String tipoFlauta;
	
	public Flauta() {
	}

	public Flauta(String nombreModelo, String tipoFlauta) {
		super();
		this.nombreModelo = nombreModelo;
		this.tipoFlauta = tipoFlauta;
	}

	public String getNombreModelo() {
		return nombreModelo;
	}

	public void setNombreModelo(String nombreModelo) {
		this.nombreModelo = nombreModelo;
	}

	public String getTipoFlauta() {
		return tipoFlauta;
	}

	public void setTipoFlauta(String tipoFlauta) {
		this.tipoFlauta = tipoFlauta;
	}

	@Override
	public String toString() {
		return "Flauta [nombreModelo=" + nombreModelo + ", tipoFlauta=" + tipoFlauta + " " + super.toString() + "]";
	}


	 
}
