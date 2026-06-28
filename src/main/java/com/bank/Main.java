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

        Account account = new Account("Sean", 5000);

        System.out.println(account);
    }
}
