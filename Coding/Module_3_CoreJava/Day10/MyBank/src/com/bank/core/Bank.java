package com.bank.core;
/*
 Fields: accountNumber (int), balance (double) , customer name (String) , phone number (String)
 */
public class Bank {
	private int accountNumber;
	private double balance;
	private String name;
	private String phoneNo;
	
	public Bank(int accountNumber, double balance, String name, String phoneNo) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.name = name;
		this.phoneNo = phoneNo;
	}
}
