package com.cms.service;

import com.cms.core.Customer;
import com.cms.custom_exceptions.CMSHandlingException;
import static com.cms.service.CMSValidations.*;

public class CMSServiceImpl implements CMSService {
	private Customer[] customers;
	private int counter;

	public CMSServiceImpl(int size) {
		super();
		this.customers = new Customer[size];
	}

	@Override
	public String registerCustomer(String firstName, String lastName, 
			String email, String password, int regAmount,
			String dob, String plan) throws CMSHandlingException {
		//invoke method of ValidationRules - to validate all i/ps
		Customer c=validateAllInputs(firstName,lastName,email,password,regAmount,
				dob,plan,customers);
		customers[counter++]=c;
		return "Registration successful !";
	}
	
	@Override
	public void displayCustomerDetails()
	{
		for (Customer c : customers)
			if(c != null)
				System.out.println(c);
	}

}
