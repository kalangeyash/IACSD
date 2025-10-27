package com.user.pojo;

import java.time.LocalDate;

public class User {
	private String name;
	private String email;
	private String password;
	private LocalDate dob;
	
	public User(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}

	public User(String name, String email, String password, LocalDate dob) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.dob = dob;
	}
	
	@Override
	public String toString() {
		return "User [ name=" + name + ", email=" + email + ", password=" + password + ", dob=" + dob + " ]";
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
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

}
