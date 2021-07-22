package com.rosters.web.models;

import java.util.ArrayList;

public class Roster {
	
	private ArrayList<Team> teams = new ArrayList<>();
	
	
	
	public Roster() {

	}
	public void setTeams(Team team) {
		
		this.teams.add(team);
		
	}
	public ArrayList getTeam() {
		
		return teams;
	}
	
	public void eliminarTeam(int index) {
		teams.remove(index);
	}
	
	
	
	@Override
	public String toString() {
		return "Roster [team=" + teams + "]";
	}
	
	

}
