package com.banking.custom_exceptions;

public class BankingException extends Exception {
	public BankingException(String message) {
		super(message);
	}
}
