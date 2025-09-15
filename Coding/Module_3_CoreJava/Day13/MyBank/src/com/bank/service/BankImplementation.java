package com.bank.service;
import com.bank.core.*;
import com.bank.custom_exception.BankingException;
import com.banking.validations.BankingValidations;
import com.bank.comparator.SortByAccountTypeandBalance;
import com.bank.comparator.SortByDOBandBalance;

import java.util.*;

public class BankImplementation implements BankService {
	
	List<BankAccount> accounts;
	
	public BankImplementation() {
		// TODO Auto-generated constructor stub
		this.accounts = new ArrayList<>();
	}

	@Override
	public String openAccount(int accountNumber, double balance, String name, String phoneNo, String accType,
			String dob, double rateOrLimit) throws BankingException {
		// TODO Auto-generated method stub
//		BankAccount newUser = BankingValidations.validateAllInputs(accountNumber, balance, name, phoneNo, accType, dob, rateOrLimit, accounts);
//		accounts.add(newUser);
//		return "User Creted Successfully";
		try {
	        BankAccount newUser = BankingValidations.validateAllInputs(
	                accountNumber, balance, name, phoneNo, accType, dob, rateOrLimit, accounts);

	        accounts.add(newUser);
	        return "User Created Successfully: " + newUser.getName();
	    } catch (Exception e) {
	        // Show the real reason instead of always success
	        return "User Creation Failed: " + e.getMessage();
	    }
	}

	@Override
	public BankAccount getSummary(int accountNo) throws BankingException {
		// TODO Auto-generated method stub
		BankAccount getSumOf = userExits(accountNo);

		return getSumOf;
	}

	@Override
	public void withdraw(int accountNo, double amount) throws BankingException {
		// TODO Auto-generated method stub
		BankAccount withdrawingAccount = userExits(accountNo);
		if(withdrawingAccount.getAccType().equals(BankAccountTypes.SAVING_ACCOUNT))
		{
			withdrawingAccount.withdraw(amount);
		}else {
			withdrawingAccount.withdraw(amount);
		}
	
		
	}

	@Override
	public void deposit(int accountNo, double amount) throws BankingException {
		// TODO Auto-generated method stub
		BankAccount depositAccount = userExits(accountNo);
		
		System.out.println(depositAccount.deposit(amount));
		
		
		
		
	}

	@Override
	public BankAccount userExits(int accountNumber) throws BankingException {
		// TODO Auto-generated method stub
		BankAccount a = new BankAccount(accountNumber);
		int index = accounts.indexOf(a);
		
		if(index == -1) {
			throw new BankingException("Account not found");
		}
		BankAccount currentUser = accounts.get(index);

		return currentUser;
	}
	
	
	@Override 
	public boolean closeAccount(int accountNumber) throws BankingException
	{
		BankAccount closeUser = userExits(accountNumber);

		System.out.println("AccountNumber "+ accountNumber +" Removed successfully ");
		
		return accounts.remove(closeUser);
		
		
	}
	
	@Override
	public void getAllAcc() {
		for(BankAccount b : accounts)
		{
			System.out.println(b);
		}
	}

	@Override
	public BankAccount sortByAccountNumber() {
		// TODO Auto-generated method stub
		Collections.sort(accounts);
		return null;
	}

	
	@Override 
	public List<BankAccount> sortByAccTypeandBalance() {
		
		Collections.sort(accounts, new SortByAccountTypeandBalance() );
		return accounts;
		
	}

	@Override
	public List<BankAccount> sortByDOBandBalance() {
		// TODO Auto-generated method stub
		Collections.sort(accounts, new SortByDOBandBalance());
		return accounts;
	}

	@Override
	public List<BankAccount> delAccWithLessBalance(double certainBalance) {
		// TODO Auto-generated method stub
		Iterator<BankAccount> itr = accounts.iterator();
		while(itr.hasNext())
		{
			if(itr.next().getBalance() < certainBalance)
			{
				itr.next();
				itr.remove();
				
			}
		}
		return null;
	}

	//@Override
//	public List<BankAccount> delAccWithLessBalance(double certainBalance) {
//		for(BankAccount b : accounts)
//		{
//		// TODO Auto-generated method stub
//			if(b.getBalance() > certainBalance)
//			{
//				accounts.remove(b);
//			}
//		}
//		return accounts;
//	}
		//Above method is not valid because we cannot modify the contents of arraylist in foreach loop
	
	
	
	
	
}
