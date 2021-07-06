package com.codingdojo.web.models;

public class Animal {
	
	public String name;
	public String breed;
	public Integer weigth;
	
	public Animal(String name, String breed, Integer weigth) {
		
		this.name = name;
		this.breed = breed;
		this.weigth = weigth;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public Integer getWeigth() {
		return weigth;
	}

	public void setWeigth(Integer weigth) {
		this.weigth = weigth;
	}

	@Override
	public String toString() {
		return "Animal [Name=" + getName() + ", Breed=" + getBreed() + ", Weigth=" + getWeigth() + "]";
	}
	
	

}
