package org.models;

public class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount() {
    }

    public BankAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public synchronized double getBalance() {
        return this.balance;
    }

    public synchronized void depositAmount(double amount) {
        this.balance = this.balance + amount;
        System.out.println("Deposited: " + amount + ", New Balance: " + this.balance);
        notifyAll();
    }

    public synchronized void withdrawAmount(double amount) {
        try{
            if (this.balance < amount) {
                    throw new InterruptedException("Insufficient balance");
            }else{
                this.balance = this.balance - amount;
                System.out.println("Withdrew: " + amount + ", New Balance: " + this.balance);
            }
        }  catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

