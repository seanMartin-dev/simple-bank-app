package com.bank;

import java.util.ArrayList;

/**
 * A class representing storage of bank accounts
 */
public class Bank {
    
    private ArrayList<Account> accounts = new ArrayList<>();

    public void addAccount(Account acc) {
        accounts.add(acc);
    }

    // Should search by ID will address later
    public Account findAccountByName(String name) {
        for (Account acc : accounts) {
            if (acc.getName().equalsIgnoreCase(name)) {
                return acc;
            }
        }
        // no match
        return null;
    }

    // To test overall account retrival
    public ArrayList<Account> getAccounts() {
        return accounts;
    }
}
