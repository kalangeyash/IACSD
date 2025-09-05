package com.accounts;
/*accountNumber (int), balance (double) , customer name (String) , phone number (String)
 * Add suitable constructor

Methods:

deposit(double amount)

withdraw(double amount) (should not allow negative balance by default)

getAccountSummary() - returns complete details of the account , in string format

getBalance() - returns account balance.

*/

public class BankAccount {
	private int accountNumber;
	private double balance;
	private String name;
	private String phoneNo;
	
	public BankAccount(int accountNumber, double balance, String name, String phoneNo) {
		
		this.accountNumber = accountNumber;
		this.setBalance(balance);
		this.name = name;
		this.phoneNo = phoneNo;
	}
	
	void deposit(double amount)
	{
		setBalance(getBalance() + amount);
	}
	
	public double withdraw(double amount) {
		if(amount>getBalance()) {
			System.out.println("Cannot withdraw\nCannot withdraw more than balance");
			return -1;
		}
		else {
			setBalance(getBalance() - amount);
		}
		return getBalance();
	}
	String getAccountSummary() {
		String res = "\n ------Getting Customer details------\nCustomer name : "+name+"\nAccount Number : "+accountNumber+"\nBalance : "+getBalance()+"\nPhone number : "+phoneNo;
		return res;
	}
	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
}
