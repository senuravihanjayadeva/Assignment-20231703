package org.models;
import java.util.concurrent.ConcurrentHashMap;

public class Bank {
    private ConcurrentHashMap<String, BankAccount> bankAccounts = new ConcurrentHashMap<>();

    public void addAccount(BankAccount account) {
        bankAccounts.put(account.getAccountNumber(), account);
    }

    public BankAccount getAccount(String accountNumber) {
        return bankAccounts.get(accountNumber);
    }
}

