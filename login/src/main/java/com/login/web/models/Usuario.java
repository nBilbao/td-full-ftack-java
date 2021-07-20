package com.login.web.models;

public class Usuario {
	
	private String pass;
	private String email;
	
	public Usuario(String pass, String email) {
		
		this.pass = pass;
		this.pass = email;
		
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Usuario [pass=" + getPass() + ", email=" + getEmail() + "]";
	}
	
	

}
