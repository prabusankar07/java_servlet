package com.lms.beans;

public class LoginBean {
	//private instance variables
	
	private String userName;
	private String password;
	private String role;
	public LoginBean(String username, String password) {
		// TODO Auto-generated constructor stub
	this.userName=username;
	this.password=password;

	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
}
	
	