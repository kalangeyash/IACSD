package com.banking.core;

import com.banking.custom_exceptions.BankingException;

/*
 * accountNumber (int), balance (double) , customer name (String) 
 * , phone number (String)

 */
public class BankAccount {
	private int accountNumber;
	private double balance;
	private String customerName;
	private String phoneNumber;
	// add account type : enum & dob - customer : LocalDate here

	public BankAccount(int accountNumber, double balance, String customerName, String phoneNumber) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.customerName = customerName;
		this.phoneNumber = phoneNumber;
	}

	public void withdraw(double amount) throws BankingException {
		if (amount > balance)
			throw new BankingException("Withdraw Failed - Insufficient Funds !!!!");
		balance -= amount;
		System.out.println("Withdrawn  " + amount + ". New balance = " + balance);
	}

	public void deposit(double amount) throws BankingException {
		if (amount <= 0)
			throw new BankingException("Deposit Failed - Invalid deposit amount");
	}

	@Override
	public String toString() {
		return "BankAccount [accountNumber=" + accountNumber + ", balance=" + balance + ", customerName=" + customerName
				+ ", phoneNumber=" + phoneNumber + "]";
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

}
