package com.example.demo.modal;


public class user {
	
	private String name;
	private String email;
	private String password;
	private String username;
	
	
	
	public user(String name, String email, String password, String username) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.username = username;
	}
	public user() {
		// TODO Auto-generated constructor stub
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String ussername) {
		this.username = ussername;
	}
	

}
