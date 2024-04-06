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

            account.depositAmount(Math.random() * 1000);

            account.withdrawAmount(3000);

            System.out.println("Balance: " + account.getBalance());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            Thread.currentThread().interrupt();
        }
    }
}

