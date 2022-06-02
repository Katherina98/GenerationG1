package com.generation.f01062022.modelos;

public class Perro extends Mascota {
	//la palabra extends significa que estamos usando herencia.
	
	private Integer cantPaseos;
	private Float tamanoHocico;
	private String sonidoVocal;
	
	public Perro() {
		super();
	}

	public Perro(Integer cantPaseos, Float tamanoHocico, String sonidoVocal) {
		super();
		this.cantPaseos = cantPaseos;
		this.tamanoHocico = tamanoHocico;
		this.sonidoVocal = sonidoVocal;
	}

	public Integer getCantPaseos() {
		return cantPaseos;
	}

	public void setCantPaseos(Integer cantPaseos) {
		this.cantPaseos = cantPaseos;
	}

	public Float getTamanoHocico() {
		return tamanoHocico;
	}

	public void setTamanoHocico(Float tamanoHocico) {
		this.tamanoHocico = tamanoHocico;
	}

	public String getSonidoVocal() {
		return sonidoVocal;
	}

	public void setSonidoVocal(String sonidoVocal) {
		this.sonidoVocal = sonidoVocal;
	}

	@Override
	public String toString() {
		return "Perro [cantPaseos=" + cantPaseos + ", tamanoHocico=" + tamanoHocico + ", sonidoVocal=" + sonidoVocal + super.toString()
				+ "]";
	}
	
	@Override
	public void hacerSonido() {
		System.out.println("guau, guau....");
	}
	
	public void mirarhacia () {
		System.out.println("izquierda");
	}
	
}
