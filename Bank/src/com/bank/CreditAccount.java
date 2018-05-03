package com.bank;

import java.util.Date;

public class CreditAccount extends Account implements HasInterest {
    private double limit;
    private double debitInterest;
    private double creditInterest;
    private Date dateCreated;

    private double excessiveAmount;

    public CreditAccount(String owner, double balance) {
        super(owner, balance);
        this.limit = 30000000;
        dateCreated = new Date();
        debitInterest = 6;
        creditInterest = 9;
    }

    public double getLimit() {
        return limit;
    }

    public double getDebitInterest() {
        return debitInterest;
    }

    public double getCreditInterest() {
        return creditInterest;
    }

    public Date getDateCreadted() {
        return dateCreated;
    }

    public double getExcessiveAmount() {
        return excessiveAmount;
    }

    @Override
    boolean deposit(double amount) {
        return super.deposit(amount);
    }

    @Override
    boolean deposit(double amount, String currency) {
        return super.deposit(amount, currency);
    }

    @Override
    public boolean getDetails() {
        System.out.printf("Type: Credit Account\n");
        System.out.printf("Owner: %s\n", super.getOwner());
        System.out.printf("Balance: %.0f\n",super.getBalance());
        System.out.printf("Limit: %.0f\n",getLimit());
        System.out.printf("Debit Interest: %.0f\n",getDebitInterest());
        System.out.printf("Credit Interest: %.0f\n",getCreditInterest());
        System.out.printf("Excessive Amount: %.0f\n\n",getExcessiveAmount());
        return true;
    }


    @Override
    boolean withdraw(double amount) {
        double balance = getBalance();
        if(amount < 0) {
            return false;
        }

        if (amount > balance) {
            if(excessiveAmount + (amount - balance) > limit) return false;

            else {
                excessiveAmount += (amount - balance);
                return super.withdraw(balance);
            }
        }

        return super.withdraw(amount);
    }

    // Implement updateBalance() method in HasInterest interface
    public boolean updateBalance() {
        double balance = getBalance();

        if(balance > 0) return deposit( balance * (debitInterest / 100) );
        else {
            excessiveAmount += excessiveAmount * (creditInterest / 100);
        }
        return true;
    }

}
