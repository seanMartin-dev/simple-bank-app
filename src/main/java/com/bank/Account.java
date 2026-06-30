package com.bank;

import java.util.concurrent.atomic.AtomicInteger;
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
    // Static counter for sequential IDs
    private static final AtomicInteger counter = new AtomicInteger(1);

    // Instance fields
    private final int id;
    private String ownerName;
    private float balance;

    /**
    * Creates a new Account with the given owner name and starting balance
    * 
    * @param ownerName the name of the account holder
    * @param initialBalance the starting balance for the account
    */
    public Account(String ownerName, float initialBalance) {
        this.id = counter.getAndIncrement();
        this.ownerName = ownerName; 
        balance = initialBalance;
    } 
    
    public String getName() {
        return ownerName;
    }

    /**
     * Deposits a specified amount into the account.
     * 
     * @param amount the amount to deposit
     * @return the updated balance after the deposit
     */
    public float deposit(float amount) {
        
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit amount must be greater than zero.");
        } else {
            balance += amount;
            return balance;
        }
    }

    /**
     * Withdraws a specified amount from the account.
     * 
     * @param amount the amount to withdraw
     * @return the updated balance after the withdrawal
     */
    public float withdraw(float amount) {
        
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdraw amount must be greater than zero.");
        }

        // if amount - withdraw is not < 0
        if ((balance - amount) < 0) {
            throw new IllegalArgumentException("Withdraw exceeds balance amount.");
        } else {
            balance -= amount;
            return balance;
        }
    }
    /**
     * Returns the current balance of the account.
     * 
     * @return the account balance
     */
    
    

    @Override
    public String toString() {
        return "AccountUniqueID: " + id + "\nOnwers Name: " + ownerName + "\nBalance: " + balance;
    }
    
}

