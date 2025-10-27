package com.healthcare.tester;

import org.hibernate.SessionFactory;
import static com.healthcare.utlis.HibernateUtils.*; 

public class TestHibernate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(SessionFactory factory = getSessionFactory())
		{	
			System.out.println("Hibernate Up and running");
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
