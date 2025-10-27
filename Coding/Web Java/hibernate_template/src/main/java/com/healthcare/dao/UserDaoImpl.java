package com.healthcare.dao;

import com.healthcare.entities.User;
import static com.healthcare.utlis.HibernateUtils.*;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class UserDaoImpl implements UserDao {

	@Override
	public String signUp(User newUser) {
		//1. Get session from SF
		Session session = getSessionFactory().getCurrentSession();
		
		//2.Begin a Transaction 
		Transaction tx = session.beginTransaction();
		try {
			//3. Session API for inserting a new record
			session.persist(newUser);
			tx.commit();
		}catch(RuntimeException e)
		{
			if(tx!=null)
			{
				tx.rollback();
			}
			throw e;
		}
		
		return "User Registered Successfully with ID = [ " +newUser.getId()+" ]";
	}


	
	
	

}
