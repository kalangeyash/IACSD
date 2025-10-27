package com.healthcare.utlis;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {
	private static SessionFactory factory;
	
	static {
		System.out.println("In static block");
		factory = new Configuration() // empty config instnce
				.configure() // populated config instance with hibernate.cfg.xml(mapping and proping)
				.buildSessionFactory(); // Creates SIngleton SF instance once 
										//because it is in Static block
		
	}
	
	public static SessionFactory getSessionFactory() {
		return factory;
	}
}
