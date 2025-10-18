package com.healthcare.tester;

import java.util.List;
import java.util.Scanner;

import com.healthcare.dao.PatientDao;
import com.healthcare.dao.PatientDaoImpl;
import com.healthcare.pojos.Patient;

public class DateBetweenTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try(Scanner sc = new Scanner(System.in))
		{
			PatientDao doa = new PatientDaoImpl(); 
			
			System.out.println("Enter two dates");
			List<Patient> p = doa.patientBetweenStartAndEnd(sc.next(), sc.next());
			p.forEach(System.out::println);
			
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
