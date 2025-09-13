package com.cms.service;

import static com.cms.service.CMSValidations.validateAllInputs;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.cms.core.Customer;
import com.cms.core.ServicePlan;
import com.cms.custom_exceptions.CMSHandlingException;

public class CMSServiceImpl implements CMSService {
	private List<Customer> customers;

	public CMSServiceImpl() {

		this.customers = new ArrayList<>(1024);
		customers.add(new Customer("Amit", "Sharma", "amit@gmail.com", "amit@123", 1000, LocalDate.of(1990, 5, 12),
				ServicePlan.SILVER));
		customers.add(new Customer("Priya", "Verma", "priya@gmail.com", "priya@123", 2000, LocalDate.of(1995, 8, 23),
				ServicePlan.GOLD));
		customers.add(new Customer("Rahul", "Patil", "rahul@yahoo.com", "rahul@123", 5000, LocalDate.of(1988, 1, 3),
				ServicePlan.DIAMOND));
		customers.add(new Customer("Sneha", "Kulkarni", "sneha@gmail.com", "sneha@123", 10000,
				LocalDate.of(1992, 11, 17), ServicePlan.PLATINUM));
		customers.add(new Customer("Vikas", "Rao", "vikas@gmail.com", "vikas@123", 2000, LocalDate.of(1998, 6, 29),
				ServicePlan.GOLD));
		customers.add(new Customer("Meera", "Joshi", "meera@gmail.com", "meera@123", 1000, LocalDate.of(2000, 2, 14),
				ServicePlan.SILVER));
		customers.add(new Customer("Arjun", "Deshmukh", "arjun@gmail.com", "arjun@123", 5000, LocalDate.of(1985, 9, 5),
				ServicePlan.DIAMOND));
		customers.add(new Customer("Kavya", "Iyer", "kavya@gmail.com", "kavya@123", 10000, LocalDate.of(1993, 12, 25),
				ServicePlan.PLATINUM));

	}

	@Override
	public String registerCustomer(String firstName, String lastName, String email, String password, int regAmount,
			String dob, String plan) throws CMSHandlingException {
		// invoke method of ValidationRules - to validate all i/ps
		Customer c = validateAllInputs(firstName, lastName, email, password, regAmount, dob, plan, customers);
		customers.add(c);
		return "Registration successful !";
	}

	@Override
	public void displayCustomerDetails() {
		for (Customer c : customers)
			System.out.println(c);
	}

	@Override
	public Customer signIn(String email, String password) throws CMSHandlingException {
		// create dummy customer instance to wrap UID
		Customer c = new Customer(email);
		// indexOf
		int index = customers.indexOf(c);
		if (index == -1) // => invalid email
			throw new CMSHandlingException("Invalid Email !!!!");
		// => email found ,get customer details from list
		Customer completeDetails = customers.get(index);
		if (!completeDetails.getPassword().equals(password))
			throw new CMSHandlingException("Invalid Password !!!!");
		//=> successful login
		return completeDetails;
	}

	@Override
	public String changePassword(String email, 
			String oldPassword, String newPass) 
					throws CMSHandlingException {
		Customer validCustomer = signIn(email, oldPassword);
		//=> login successful
		validCustomer.setPassword(newPass);
		return "Password updated !";		
	}

	@Override
	public String unsubscribeCustomer
	(String email) throws CMSHandlingException{
		/*
		 * Ask yourself - delete - delete by PK 
		 * - YES -> remove(index) | remove(o)
		 * - no -> other options...to be discussed later....
		 */
		Customer c=new Customer(email);
		if(customers.remove(c))
			return "Customer un subscribed!";
		throw new CMSHandlingException("Un Subscription Failed - email doesn't exist!!!!!");
	}

	@Override
	public void searchByPlanAndDate(String plan, String date) {
		ServicePlan myPlan=ServicePlan.valueOf(plan);
		LocalDate dob=LocalDate.parse(date);//yyyy-MM-dd
		for(Customer c : customers)
		{
			if(c.getPlan().equals(myPlan) && c.getDob().isAfter(dob)) {
				System.out.println(c.getFirstName()+" "+c.getLastName());
			}
		}
		
	}

	@Override
	public void sortCustomersByEmail() {
		Collections.sort(customers);
			
	}
	
	
	

}
