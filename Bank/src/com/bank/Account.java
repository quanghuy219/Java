package com.bank;

public abstract class Account {
    private String owner;
    private double balance;

    public Account(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public Account() {
        this.owner = null;
        this.balance = 0;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getOwner() {
        return this.owner;
    }

    boolean deposit(double amount) {
        if( amount <= 0) return false;

        balance += amount;
        return true;
    }

    public double getBalance() {
        return balance;
    }

    private double convertCurrency(double amount, String currency) {
        double rate = 0;

        if ( currency.equals("USD") ){
            rate = 22677;
        } else if( currency.equals("GBP") ) {
            rate = 31396.08;
        } else if ( currency.equals("VND") ) {
            rate = 1;
        } else if (currency.equals("SGD")) {
            rate = 17210.03;
        }
        return rate * amount;
    }

    //Overloading
    boolean deposit (double amount, String currency) {

        if (amount < 0) return false;

        if ( currency.equals("USD") || currency.equals("GBP") || currency.equals("VND") || currency.equals("SGD")){
            return deposit( convertCurrency(amount, currency) );
        } else {
            return false;
        }
    }


    boolean withdraw(double amount) {
        if (amount > balance || amount < 0) {
            return false;
        } else {
            balance -= amount;
            return true;
        }
    }


    //Overloading
    boolean withdraw (double amount, String currency) {
        if (amount < 0) return false;

        if ( currency.equals("USD") || currency.equals("GBP") || currency.equals("VND") || currency.equals("SGD")){
            return withdraw( convertCurrency(amount, currency) );
        } else {
            return false;
        }

    }

    double checkBalance() {
        return this.balance;
    }

    public abstract boolean getDetails();

 }
