package com.bank;

import java.util.*;

public class Bank {
    private String name;
    private String address;
    private ArrayList<Account> accountList = new ArrayList<Account>();

    public Bank(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public boolean addAccount(Account newAccount) {
        this.accountList.add(newAccount);
        return true;
    }

    public boolean printAllAccount() {
        System.out.println("Bank: " + this.name );
        System.out.println("Address: " + this.address);
        System.out.println("List Account: ");
        for (Account acc : accountList ) {
            acc.getDetails();
        }
        return true;
    }

    public double calculateTotalBalance( ) {
        double total = 0;
        for (Account acc : accountList ) {
            total += acc.checkBalance();
        }
        return total;
    }
}
