package com.student;
import com.person.*;
import static java.lang.System.*;

public class Student extends Person{
	private int PRN;
	private static int countPRN;
	private double fees;
	private int rollNo;
	static 
	{	
		out.println("hello from static student block");
		countPRN = 1001;
	}
	{
		out.println("hello from non static student block");
		 
	}
	
	public Student(String firstName, String lastName,double fees ,int rollNo){
		super(firstName,lastName);
		this.PRN = countPRN++;
		this.fees = fees;
		this.rollNo = rollNo;
	}

	public double getFees() {
		return fees;
	}

	public void setFees(float fees) {
		this.fees = fees;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public int getPRN() {
		return PRN;
	}
	
	public void display() {
		super.display();
		System.out.println("Details for Student : \n"+ "Fees for student : "+fees+"\nPRN : "+PRN+"\nRollNo : "+rollNo);
	}
	

}
