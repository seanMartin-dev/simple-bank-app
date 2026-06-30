package com.bank;

import java.util.Scanner;
/**
 * A class that creates a opening userface
 * 
 * 
 */
public class UserInterface{

    private Scanner scanner;

    // Constructor
    public UserInterface() {
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        showMenu();
        createBankdb();
    }

    public void createBankdb() {
        Bank bankdb = new Bank();
    }
      
    public void showMenu() {
        System.out.println("Bank of java\nPress 1 to login\nPress 2 to create an account");
        String choice = scanner.nextLine();

        // Call handle choice
        handleChoice(choice);
    }

    public void handleChoice(String choice){
        if(choice.equals("1")) {
            // Go to loginFlow()
        } else if (choice.equals("2")) {
            Account newAccount = createAccount();
            // Save new account to array
            System.out.println("Saving acount " + newAccount.toString());
            // Return to main menu
            start();
        } else {
            System.out.println("Invalid choice");
            showMenu();
        }
    }
    
    public Account createAccount() {
        Boolean correctInput = false;

        String name = null; //create variable to exsist after while loop
        float startingAmount = 0f; // as the comment above

        // Confirm with user and store correct name
        while (!correctInput) {
            System.out.println("Please enter your name:");
            name = scanner.nextLine();

            System.out.println("Name provided: " + name + " correct?");
            System.out.println("Yes press 1 \nNo press 2");
        
            String choice = scanner.nextLine();

            if (choice.equals("1")) {
                correctInput = true;
            } else if (choice.equals("2")) {
                System.out.println("Okay, let's try again.");
            } else {
                System.out.println("Invalid choice, try again");
            }
        }

        // Reset flag
        correctInput = false;

        // Confirm with user and store correct starting balance
        while(!correctInput) {
            System.out.println("Please enter starting balance:");
            startingAmount = Float.parseFloat(scanner.nextLine());

            System.out.println("Starting balance: " + startingAmount + " correct value?");
            System.out.println("Yes press 1 \nNo press 2");

            String choice = scanner.nextLine();

            if (choice.equals("1")) {
                correctInput = true;
            } else if (choice.equals("2")) {
                System.out.println("Okay, let's try again.");
            } else {
                System.out.println("Invalid choice, try again.");
            }            
        } 
        
        Account newAccount = new Account(name, startingAmount);
        return newAccount;
    }
}