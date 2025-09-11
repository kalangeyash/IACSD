package com.bank.exception;

import com.accounts.BankAccount;

public class InsufficientBalanceException extends Exception {
	public InsufficientBalanceException(String errMessage) {
		super(errMessage);
	}
	
	public static void savingCheckBalance(double amt,BankAccount[] arr,int idx,double minBal) throws InsufficientBalanceException
	{
		if((arr[idx].getBalance() + amt) > minBal  )
		{
			throw new InsufficientBalanceException("You have insufficient Balance in your account");
		}
	}
	
	public static void currentCheckBalance(double amt,BankAccount[] arr,int idx,double minBal) throws InsufficientBalanceException
	{
		if((arr[idx].getBalance() + amt) > minBal  )
		{
			throw new InsufficientBalanceException("You have insufficient Balance in your account");
		}
	}
}
