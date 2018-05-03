package com.company;

public class Account {
    private int accountNumber;
    private double balance;
    private String name;
    private String email;
    private String phoneNumber;

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositFunds(double increment) {
        this.balance += increment;
        System.out.println("New Balance: " + this.balance);
    }

    public void withdrawFunds(double withdrawal) {
        if (this.balance - withdrawal <= 0) System.out.println("Withdraw amount exceeds your balance");

        else {
            this.balance -= withdrawal;
            System.out.println("You have withdrawn " + withdrawal + "$\n");
            System.out.println("New balance: " + this.balance + "$");
        }
    }
}
