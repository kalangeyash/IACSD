package com.cricket.validations;

import java.util.List;

import com.cricket.core.Cricketer;
import com.cricket.exception.MyCricketException;

public class CricketValidations {
	
	public static Cricketer validateCricketer(String name, int age, String email_id,String phone ,int rating,List<Cricketer>players) throws MyCricketException
	{
		throwIfPlayerExists(email_id, players);
		Cricketer newCricketer = new Cricketer(name, age, email_id, phone, rating);
		return newCricketer;
	
		
	}
	
	public static boolean playerExists(String email, List<Cricketer> players) 
	{
		Cricketer temp = new Cricketer(email);
		
		return players.contains(temp);
	}
	
	public static void throwIfPlayerExists(String email, List<Cricketer> players) throws MyCricketException
	{		Cricketer temp = new Cricketer(email);
			if(players.contains(temp))
			{
				throw new MyCricketException("Player already exists");
			}
	}

//	public void validateEmail
}
