package com.codingdojo.web.models;

public class Dog extends Animal implements Pet{

	public Dog(String name, String breed, Integer weigth) {
		super(name, breed, weigth);
		// TODO Auto-generated constructor stub
	}
	
	public String showAffection() {
		
		if(getWeigth()<30 && getWeigth()>10) {
			return "Perrito Sano";
		}
		else {
			return "Perro con problemas de peso";
		}
	}
		

}
