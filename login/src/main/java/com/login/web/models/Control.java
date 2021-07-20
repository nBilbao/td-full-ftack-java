package com.login.web.models;

import java.util.ArrayList;

public class Control {
	
	private ArrayList<Usuario> user;
	
	
	public Control() {
		
		user = new ArrayList<Usuario>();
	}


	public ArrayList<Usuario> getUser() {
		return user;
	}


	public void setUser(Usuario user) {
		this.user.add(user);
	}


	@Override
	public String toString() {
		return "Control [user=" + user + "]";
	}
	

}
