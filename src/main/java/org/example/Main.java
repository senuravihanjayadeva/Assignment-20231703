package org.example;

import org.models.Bank;
import org.models.BankAccount;
import org.models.User;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        BankAccount account = new BankAccount("123456", "John Doe", 1000);
        bank.addAccount(account);

        for (int i = 0; i < 10; i++) {
            Thread clientThread = new Thread(new User(bank, "123456"));
            clientThread.start();
        }
    }
}