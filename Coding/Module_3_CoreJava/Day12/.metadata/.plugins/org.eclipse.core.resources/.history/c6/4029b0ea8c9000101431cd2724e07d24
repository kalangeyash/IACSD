package com.cms.service;

import com.cms.core.Customer;
import com.cms.custom_exceptions.CMSHandlingException;

//business logic layer (service layer) interface
public interface CMSService {
//register customer
	String registerCustomer(String firstName, String lastName, String email, String password, int regAmount, String dob,
			String plan) throws CMSHandlingException;

	void displayCustomerDetails();

	Customer signIn(String email, String password) throws CMSHandlingException;

	String changePassword(String email, String oldPassword, String newPass) throws CMSHandlingException;

	String unsubscribeCustomer(String next) throws CMSHandlingException;

	void searchByPlanAndDate(String plan, String date);

	void sortCustomersByEmail();
}
