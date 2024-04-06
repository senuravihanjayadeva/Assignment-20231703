package org.example;

import org.models.Bank;
import org.models.BankAccount;
import org.models.User;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        BankAccount account1 = new BankAccount("884310", "Senura Jayadeva", 2000);
        BankAccount account2 = new BankAccount("222286", "Supun Jayaweera", 4000);

        bank.addAccount(account1);
        bank.addAccount(account2);

        ThreadGroup regularClients = new ThreadGroup("Regular Clients");
        ThreadGroup vipClients = new ThreadGroup("VIP Clients");

        for (int i = 0; i < 5; i++) {
            new Thread(regularClients, new User(bank, "884310"), "Client " + i).start();
        }
        for (int i = 0; i < 5; i++) {
            new Thread(vipClients, new User(bank, "222286"), "VIP Client " + i).start();
        }
    }
}