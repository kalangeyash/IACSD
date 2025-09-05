package com.student;
import com.person.*;


public class Student extends Person {
	// graduation year,course,fees,marks
	private int gradYear;
	private String courseName;
	private int fees;
	private int marks;

	public Student(String fn, String ln, int year, String course, int fees, int marks) {
		super(fn, ln);
		System.out.println("in student's ctor");
		// invokes immediate super class' matching ctor.
		
		// super.firstName=fn;
		this.gradYear = year;
		this.courseName = course;
		this.fees = fees;
		this.marks = marks;
		
	}
	public String getLastName() {
		return "";
	}
	/*
	 * Add overriding form of the toString : method to return COMPLETE details of a
	 * student
	 */
	@Override
	public String toString() {
		System.out.println("in student's toString");
		return "Student " + super.toString() + " graduated in " + gradYear + " enrolled in " + courseName + " fees "
				+ fees + " marks obtained " + marks;
	}

	// Feedback submission By student
//	 i/p : faculty name, feedback comment
	public void submitFeedback(String facultyName, String comment) {
		System.out.println("Student " + getFirstName() 
		+ " " + super.getLastName()
				+ " submitting feedback for the faculty " 
		+ facultyName + " comment " + comment);
	}

}
