package com.person;

public class Person {
	private String firstName;
	private String lastName;
	
	public Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	String getFirstName(){
		return firstName;
	}
	
	String getLastName() {
		return lastName;
	}
	
	void setFirstName(String firstName){
		this.firstName = firstName;
	}

	void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void display() {
		System.out.println("Name of person :\n "+firstName+" "+lastName);
	}
	

}
