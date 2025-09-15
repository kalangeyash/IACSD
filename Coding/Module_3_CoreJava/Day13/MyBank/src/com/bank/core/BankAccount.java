package com.bank.core;
import java.time.LocalDate;


import com.bank.custom_exception.BankingException;
/*
 Fields: accountNumber (int), balance (double) , customer name (String) , phone number (String)
 */
public class BankAccount implements Comparable<BankAccount> {
	private int accountNumber;
	private double balance;
	private String name;
	private String phoneNo;
	private BankAccountTypes accType;
	private LocalDate dob;
	
	public BankAccount(int accountNumber, double balance, String name, String phoneNo,BankAccountTypes accType, LocalDate dob) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.name = name;
		this.phoneNo = phoneNo;
		this.accType = accType;
		this.dob = dob;
	}
	
	public BankAccountTypes getAccType() {
		return accType;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void withdraw(double amt) throws BankingException
	{
		if(balance<amt)
		{
			System.out.println("Insufficient Balance");
			System.out.println(getBalance());
		}
		else {
			balance -= amt;
			System.out.println(getBalance());
		}
	}

	public double deposit(double amount) {
		balance += amount;
		return getBalance();
	}

	public double getBalance() {
		return balance;
	}
	
	@Override
	public boolean equals(Object o)
	{
//		BankAccount tmp = (BankAccount) o;
		if(o instanceof BankAccount) {
			BankAccount temp = (BankAccount) o;
			return this.accountNumber==temp.accountNumber;
		}
		return false;
		
	}

	@Override
	public String toString() {
		return "BankAccount [accountNumber=" + accountNumber + ", balance=" + balance + ", name=" + name + ", phoneNo="
				+ phoneNo + ", accType=" + accType + ", dob=" + dob + "]";
	}

	public BankAccount(int accountNumber) {
		super();
		this.accountNumber = accountNumber;
	}

	@Override
	public int compareTo(BankAccount o) {
		// TODO Auto-generated method stub
		return Integer.compare(this.accountNumber, o.accountNumber);
		
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}


}
