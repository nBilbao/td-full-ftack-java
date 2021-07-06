package com.codingdojo.web.models;

public class Cat extends Animal implements Pet {

	public Cat(String name, String breed, Integer weigth) {
		super(name, breed, weigth);
		// TODO Auto-generated constructor stub
	}

	
	public String showAffection() {
		// TODO Auto-generated method stub
		
		return "El gatito está bien alimentado!";
	}

}
