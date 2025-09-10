package com.accounts;
/*Create subclasses:

SavingAccount -> add interestRate field and method applyInterest().


SavingAccount -> should not allow any negative balance in  withdraw operation .It should fail in such case.


*/
public class SavingAccount extends BankAccount {
	
	private float roi;
	private double minBal;
	
	public SavingAccount(int accountNumber, double balance, String name, String phoneNo,float roi,double minBal)
	{
		super(accountNumber,balance,name,phoneNo);
		this.roi = roi;
		this.minBal = minBal;
	}
	
//	public double withdraw(double amount) {
//		double res = super.withdraw(amount);
//		return res;
//	}
	@Override
	public double withdraw(double amount) {
	    double balance = getBalance();
	    if (amount > balance) {
	        System.out.println("Insufficient funds.");
	        return getBalance();
	    }
	    if ((balance - amount) < minBal) {  // 1000 - 300 < 800  | 700<800
	        System.out.println("Cannot withdraw beyond minimum balance requirement.");
	        return getBalance();
	    }
	    balance -= amount;
	    setBalance(balance);
	    return balance;
	}

	
	double applyInterest() {
		setBalance(getBalance() * (1+roi));
		return getBalance();
	}
	
	
	
	
}
