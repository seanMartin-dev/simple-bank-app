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

        System.out.println(account1);
        System.out.println(account2);
        System.out.println(account3);

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
