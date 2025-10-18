package com.healthcare.tester;

import java.util.Scanner;

import com.healthcare.dao.PatientDao;
import com.healthcare.dao.PatientDaoImpl;

public class SigninTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try (Scanner sc=new Scanner(System.in)) {
			
			PatientDao dao = new PatientDaoImpl();
//			1. create dao instance
//			DoctorDao dao=new DoctorDaoImpl();
//			//clnt servicing phase 
//			System.out.println("Enter speciality");
//			System.out.println("Docs by speciality - ");
//			dao.findBySpeciality(sc.next())
//			.forEach(System.out::println);
//			
//			//3. destroy - clean up
//			dao.cleanUp();
			
			dao.patientSignin("siddharth.rao@example.in","pass202");
			
			System.out.println("Showing Patient Dashboard");
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
