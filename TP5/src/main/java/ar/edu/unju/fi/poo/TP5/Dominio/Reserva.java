package ar.edu.unju.fi.poo.TP5.Dominio;

import javax.xml.crypto.Data;

public abstract class Reserva {
	private static Integer nextId = 0;
	
	private Integer id;
	
	private Ciudad origen;
	
	private Ciudad destino;
	
	private Data salida;
	
	private Data llegada;
	
	private Pasajero pasajero;

	
	public Reserva() {
		super();
	}


	public Reserva(Ciudad origen, Ciudad destino, Data salida, Data llegada, Pasajero pasajero) {
		super();
		nextId++;
		this.id =nextId;
		this.origen = origen;
		this.destino = destino;
		this.salida = salida;
		this.llegada = llegada;
		this.pasajero = pasajero;
	}
	
	
	
	
}
