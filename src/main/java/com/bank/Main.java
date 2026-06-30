package com.bank;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Create a welcome interface object
        UserInterface ui= new UserInterface();

        ui.start();

        Account account1 = new Account("Sean", 5000);
        Account account2 = new Account("Bill", 10);
        Account account3 = new Account("Tom", 450);

        Bank bankdb = new Bank();
        bankdb.addAccount(account3);
        bankdb.addAccount(account2);
        bankdb.addAccount(account1);

        System.out.println(bankdb.findAccountByName("Bill"));
        

        try {
            account1.deposit(-1);
        } catch (IllegalArgumentException e) {
            System.out.print("Caught IllegalArgumentException Exception: Invalid deposit amount.\n");
        }

        try {
            account1.withdraw(-5);
        } catch (IllegalArgumentException e) {
            System.out.print("Caught IllegalArgumentException: Invalid withdraw amount.\n");
        }

        try {
            account1.withdraw(5001);
        } catch (IllegalArgumentException e) {
            System.out.print("Caught IllegalArgumentException: Withdraw exceeds balance.\n");
        }

    }
}
