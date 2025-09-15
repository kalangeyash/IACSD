package com.bank.service;
import java.util.List;

import com.bank.core.*;
import com.bank.custom_exception.BankingException;

public interface BankService {

		String openAccount(int accountNumber, double balance, String name, String phoneNo,String accType, String dob,double rateOrLimit) throws BankingException;
	
	 	// add a method to get account summary
		BankAccount getSummary(int accountNo) throws BankingException;
		// add a method to withdraw funds
		void withdraw(int accountNo, double amount) throws BankingException;
		// add a method to deposit funds
		void deposit(int accountNo, double amount) throws BankingException;
		
		BankAccount userExits(int accountNumber) throws BankingException;
		
		boolean closeAccount(int accountNumber) throws BankingException;
		
		void getAllAcc();
		
		BankAccount sortByAccountNumber();
		
		List<BankAccount> sortByAccTypeandBalance();
		
		List<BankAccount> sortByDOBandBalance();
		
		List<BankAccount> delAccWithLessBalance(double certainBalance);
		

}	

