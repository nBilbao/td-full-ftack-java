package com.rosters.web.models;

import java.util.ArrayList;

public class Team {
	
	private String name;
	private ArrayList<Player> jugador;
	private int id=0;
	
	public Team() {
		// TODO Auto-generated constructor stub
		id++;
	}
	
	
	public Team(String name) {
		
		this.name  = name;
		this.jugador = new ArrayList<>();
		id++;
		
	}
	
	public int getID() {
		return id;
	}


	public int contadorJugadores() {
		
		return jugador.size();
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	public void setPlayer(Player jugador) {
		
		this.jugador.add(jugador);
		
	}


	@Override
	public String toString() {
		return "Team [name=" + name + ", jugador=" + jugador + "]";
	}
	
	

}
