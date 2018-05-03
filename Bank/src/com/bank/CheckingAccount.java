package com.bank;

public class CheckingAccount extends Account {

    public CheckingAccount(String owner, double balance) {
        super(owner, balance);
    }

    @Override
    public boolean getDetails() {
        System.out.printf("Type: Checking Account\n");
        System.out.printf("Owner: %s\n", super.getOwner());
        System.out.printf("Balance: %.0f\n\n",super.getBalance());
        return true;
    }
}
