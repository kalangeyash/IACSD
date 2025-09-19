package com.app.core;

import java.time.LocalDate;

public class Student{
	
	private String rollNo;
	private String name;
	private LocalDate dob;
	private Subject subject;
	private double mark;
	private  Address address;

	public Student(String rollNo, String name, LocalDate dob, Subject subject, double mark) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.dob = dob;
		this.subject = subject;
		this.mark = mark;
	}

	@Override
	public String toString() {
		return "Student rollNo=" + rollNo + ", name=" + name + ", dob=" + dob + ", subject=" + subject + ", mark=" + mark
				+ " adr : " + address;
	}

	public String getRollNo() {
		return rollNo;
	}

	public String getName() {
		return name;
	}

	public LocalDate getDob() {
		return dob;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Subject getSubject() {
		return subject;
	}

	public double getmark() {
		return mark;
	}

	public void assignAddress(Address a) {
		address = a;
	}

}
