package com.generation.f02062022.ejercicio2modelos;

public class Administrador extends Trabajador{

	private int cantNominas;
	private int cantFacturas;
	private Boolean matematicas;
	private Boolean revisionPresupuestos;
	
	public Administrador () {
		
	}
	
	public Administrador(int cantNominas, int cantFacturas, Boolean matematicas, Boolean revisionPresupuestos) {
		super();
		this.cantNominas = cantNominas;
		this.cantFacturas = cantFacturas;
		this.matematicas = matematicas;
		this.revisionPresupuestos = revisionPresupuestos;
	}

	public int getCantNominas() {
		return cantNominas;
	}

	public void setCantNominas(int cantNominas) {
		this.cantNominas = cantNominas;
	}

	public int getCantFacturas() {
		return cantFacturas;
	}

	public void setCantFacturas(int cantFacturas) {
		this.cantFacturas = cantFacturas;
	}

	public Boolean getMatematicas() {
		return matematicas;
	}

	public void setMatematicas(Boolean matematicas) {
		this.matematicas = matematicas;
	}

	public Boolean getRevisionPresupuestos() {
		return revisionPresupuestos;
	}

	public void setRevisionPresupuestos(Boolean revisionPresupuestos) {
		this.revisionPresupuestos = revisionPresupuestos;
	}

	@Override
	public String toString() {
		return "Administrador [cantNominas=" + cantNominas + ", cantFacturas=" + cantFacturas + ", matematicas="
				+ matematicas + ", revisionPresupuestos=" + revisionPresupuestos + super.toString() + "]";
	}
	
	public int nominasYfacturas (int num1, int num2) {
		int resultado = num1 + num2; 
		return resultado;
	
	}
	
	public String cumpleRequisitos (boolean re1, boolean re2) {
		if (re1 == true && re2 == true) {
			return "Cumple requisitos para trabajar en el area";
		}
			return "No cumple con los requisitos para trabajar en el area";
	
	}
		
}
