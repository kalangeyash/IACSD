package com.bank.custom_exception;

public class BankingException extends Exception {
	public BankingException(String errMessgae)
	{
		super(errMessgae);
	}
}
