package main.java.com.bank;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Bank of Java\nPress 1 to login\nPress 2 to create an account");
        
        // Create a scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Read a string
        String userAnswer = scanner.nextLine();
        scanner.close();

        // Show output 
        System.out.println("User chose: " + userAnswer);

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
