package com.store.core;

public class User {
	private String username;
	private String password;
	public void setPassword(String password) {
		this.password = password;
	}
	private UserStatus isAdmin;
	
	
	public User(String username, String password,UserStatus isAdmin ) {
		
		this.username = username;
		this.password = password;
		this.isAdmin = isAdmin;
	}
	public User(String username) {
		super();
		this.username = username;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public UserStatus getIsAdmin() {
		return isAdmin;
	}
	public void setIsAdmin(UserStatus isAdmin) {
		this.isAdmin = isAdmin;
	}
	
	
}
