package com.greatNameNumber.web.models;

import java.util.Random;

public class Number {
	
	private Integer number;
	
	public Number() {
		number = buildNumber();
	}
	

	public Integer buildNumber() {
		
		Random random = new Random();
		
		number = random.nextInt(100)+1;
		
		return number;
	}
	
	
	public Integer getNumber() {
		return number;
	}

	@Override
	public String toString() {
		return ""+getNumber();
	}
	
	

	
	
	

}
