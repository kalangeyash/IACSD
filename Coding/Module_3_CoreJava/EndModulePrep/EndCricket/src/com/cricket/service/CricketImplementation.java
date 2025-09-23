package com.cricket.service;

import java.util.ArrayList;
import java.util.List;

import com.cricket.core.Cricketer;
import com.cricket.exception.MyCricketException;
import com.cricket.validations.CricketValidations;

import static com.cricket.validations.CricketValidations.*;

public class CricketImplementation implements CricketService {
	
	List<Cricketer> players;
	
	public CricketImplementation()
	{
		this.players = new ArrayList<>();
	}
	

	@Override
	public String addCricketer(String name, int age, String email_id, String phone, int rating) throws MyCricketException {
		// TODO Auto-generated method stub
		Cricketer newCricketer = CricketValidations.validateCricketer(name, age, email_id, phone, rating, players);
		players.add(newCricketer);
		return "Cricketer added successfully";
		
	}

	@Override
	public String changeRating(String email_id, int rating) throws MyCricketException {
		// TODO Auto-generated method stub
		CricketValidations.playerExists(email_id, players);
		Cricketer temp = new Cricketer(email_id);
		int idx = players.indexOf(temp);
		
		players.get(idx).setRating(rating);
		
		return "Rating has been changed with "+ rating;
		
	}

	@Override
	public void searchCricketerByName(String email_id,String name) throws MyCricketException {
		// TODO Auto-generated method stub
		if(!CricketValidations.playerExists(email_id, players))
		{
			System.out.println("Player does not exists with this name ");
			return;
		}
		boolean found = false;
		for(Cricketer c : players)
		{
			if(c.getName().equals(name) &&  c.getEmail_id().equals(email_id))
			{
				System.out.println(c);
				found = true;
			}
		}
		
		if(!found)
		{
			System.out.println("No player found with the given name and email.");
		}
		/*
		 * if (!CricketValidations.playerExists(email_id, players)) {
        System.out.println("Player does not exist with this email");
        return;
    }
    
    boolean found = false;
    for (Cricketer c : players) {
        if (c.getName().equalsIgnoreCase(name) && c.getEmailId().equalsIgnoreCase(email_id)) {
            System.out.println(c);
            found = true;
        }
    }
    
    if (!found) {
        System.out.println("No player found with the given name and email.");
    }
		 * */
		
		
	}

	@Override
	public void allCricketerSummary() {
		// TODO Auto-generated method stub
		players.stream()
		.forEach(t-> System.out.println(t));
		
	}

	@Override
	public void sortByRating() {
		// TODO Auto-generated method stub
		players.stream()
		.sorted((t1,t2)-> Integer.compare(t1.getRating(), t2.getRating()) )
		.forEach(t->System.out.println(t));
	}

}
