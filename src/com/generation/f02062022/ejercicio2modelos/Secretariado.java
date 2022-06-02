package com.generation.f02062022.ejercicio2modelos;

public class Secretariado extends Trabajador{

	private int cantLlamados;
	private int cantReuniones;
	private Boolean ingles;
	private Boolean organizarAgenda;
	
	
	public Secretariado () {
		
	}


	public Secretariado(int cantLlamados, int cantReuniones, Boolean ingles, Boolean organizarAgenda) {
		super();
		this.cantLlamados = cantLlamados;
		this.cantReuniones = cantReuniones;
		this.ingles = ingles;
		this.organizarAgenda = organizarAgenda;
	}


	public int getCantLlamados() {
		return cantLlamados;
	}


	public void setCantLlamados(int cantLlamados) {
		this.cantLlamados = cantLlamados;
	}


	public int getCantReuniones() {
		return cantReuniones;
	}


	public void setCantReuniones(int cantReuniones) {
		this.cantReuniones = cantReuniones;
	}


	public Boolean getIngles() {
		return ingles;
	}


	public void setIngles(Boolean ingles) {
		this.ingles = ingles;
	}


	public Boolean getOrganizarAgenda() {
		return organizarAgenda;
	}


	public void setOrganizarAgenda(Boolean organizarAgenda) {
		this.organizarAgenda = organizarAgenda;
	}


	@Override
	public String toString() {
		return "Secretariado [cantLlamados=" + cantLlamados + ", cantReuniones=" + cantReuniones + ", ingles=" + ingles
				+ ", organizarAgenda=" + organizarAgenda + super.toString() + "]";
	}
	
	
	public int llamadosYreuniones (int num1, int num2) {
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