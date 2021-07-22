package com.rosters.web.models;

public class Player {
	
	private String first_name;
	private String last_name;
	private String age;
	private int id=0;
	
	
	public Player(String first_name, String last_name, String age) {
		
		this.first_name = first_name;
		this.last_name = last_name;
		this.age = age;
		id++;
	}
	
	public int getID() {
		return id;
	}


	public String getFirst_name() {
		return first_name;
	}


	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}


	public String getLast_name() {
		return last_name;
	}


	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}


	public String getAge() {
		return age;
	}


	public void setAge(String age) {
		this.age = age;
	}


	@Override
	public String toString() {
		return "Player [first_name=" + first_name + ", last_name=" + last_name + ", age=" + age + "]";
	}
	
	
	
	
	
	

}
