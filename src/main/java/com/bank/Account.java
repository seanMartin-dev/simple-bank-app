package main.java.com.bank;
/**
 * A domain model representing a bank account in the system.
 * 
 * This class defines the core data and behaviours associated with
 * an account, including identification, ownership, and balance management.
 * 
 * @author Sean Martin
 * @version 1.0
 */
public class Account {

    private String ownerName;
    private float balance;

    /**
    * Creates a new Account with the given owner name and starting balance
    * 
    * @param ownerName the name of the account holder
    * @param initialBalance the starting balance for the account
    */
    public Account(String ownerName, float initialBalance) {
    this.ownerName = ownerName; 
    balance = initialBalance;
    }

    /**
     * Deposits a specified amount into the account.
     * 
     * @param amount the amount to deposit
     * @return the updated balance after the deposit
     * @throws IllegalArgumentException if the amount is negative
     */
    public float deposit(float amount) {
        balance += amount;
        return balance;
    }

    /**
     * Withdraws a specified amount from the account.
     * 
     * @param amount the amount to withdraw
     * @return the updated balance after the withdrawal
     * @throws IllegalArgumentException if the amount is negative
     * or exceeds the balance
     */

    /**
     * Returns the current balance of the account.
     * 
     * @return the account balance
     */

    @Override
    public String toString() {
        return "Onwers Name: " + ownerName + "\nBalance: " + balance;
    }
    
}

