package org.models;

public class User implements Runnable {
    private Bank bank;
    private String accountNumber;

    public User(Bank bank, String accountNumber) {
        this.bank = bank;
        this.accountNumber = accountNumber;
    }

    @Override
    public void run() {
        try {
            BankAccount account = bank.getAccount(accountNumber);

            //Deposit a Random Amount
            account.depositAmount(Math.random() * 1000);

            //Withdraw an amount
            account.withdrawAmount(3000);

            System.out.println("Balance: " + account.getBalance());
        } catch (Exception e) {
            Thread.currentThread().interrupt();
            System.out.println("Error: " + e.getMessage());
        }
    }
}

