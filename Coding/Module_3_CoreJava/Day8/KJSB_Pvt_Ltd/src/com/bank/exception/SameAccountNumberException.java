// SameAccountNumberException.java
package com.bank.exception;

import com.accounts.BankAccount;

public class SameAccountNumberException extends Exception {
    public SameAccountNumberException(String errMessage) {
        super(errMessage);
    }

    public static void checkAccNum(int accNo, BankAccount[] existingAccounts, int count) throws SameAccountNumberException {
        for (int i = 0; i < count; i++) {
            if (existingAccounts[i].getAccountNumber() == accNo) {
                throw new SameAccountNumberException("Account number " + accNo + " already exists.");
            }
        }
    }
}
