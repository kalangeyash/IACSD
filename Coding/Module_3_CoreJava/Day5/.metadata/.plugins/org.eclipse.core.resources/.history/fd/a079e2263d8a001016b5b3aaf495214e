package com.faculty;
import com.person.*;

public class Faculty extends Person {
	private static int empIdGenerator;
	private int empId;
	private float sal;
	
	{ 
		System.out.println("hello from non static faculty");
		empIdGenerator = 501;
	}
	
	
	public Faculty(String firstName, String lastName,float sal){
		super(firstName,lastName);
		empId = empIdGenerator++;
		this.sal = sal;
	}


	public float getSal() {
		return sal;
	}


	public void setSal(float sal) {
		this.sal = sal;
	}


	public int getEmpId() {
		return empId;
	}
	public void display() {
		super.display();
		System.out.println("Details for Faculty : \n"+ "EMP ID for Faculty : "+empId+"\nSalary : "+sal);
	}
	
}
