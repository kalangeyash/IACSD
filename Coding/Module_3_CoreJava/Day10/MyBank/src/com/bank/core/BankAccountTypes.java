package com.bank.core;

public enum BankAccountTypes {
	SAVING_ACCOUNT(1), CURRENT_ACCOUNT(2);
	
	private int type ;
	
	private BankAccountTypes(int type){
		this.type = type;
	}
	
	public int getAccountType() {
		return type;
	}
	
	@Override
	public String toString() {
		return name()+" Account Type "+this.type;
	}	
}
