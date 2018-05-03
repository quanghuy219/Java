package com.bank;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.text.ParseException;

public class SavingAccount extends Account implements HasInterest {
    private static double interest;
    private Date dateCreated;

    public SavingAccount(String owner, double balance) {
        super(owner, balance);

        // Convert string to date
        SimpleDateFormat dateformat2 = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
        String strdate2 = "02-04-2013 11:35:42";
        try {
            this.dateCreated = dateformat2.parse(strdate2);
        } catch (ParseException e) {
            this.dateCreated = new Date();
            e.printStackTrace();
        }

    }

    public static double getInterest() {
        return interest;
    }

    public Date getDateCreated() {
        return this.dateCreated;
    }

    public static void setInterest(double interest) {
        SavingAccount.interest = interest;
    }


    private boolean checkSameDay(Date date) {
        Calendar cal1 = Calendar.getInstance();
        cal1.setTime(date);

        Calendar cal2 = Calendar.getInstance();
        cal2.setTime(this.dateCreated);

        if(cal1.get(Calendar.DAY_OF_MONTH) == cal2.get(Calendar.DAY_OF_MONTH) && cal1.get(Calendar.DATE) == cal2.get(Calendar.DATE))
            return true;

        else return false;
    }

    // Implement updateBalance() method
    // Balance to be updated in exact month and date which the account was created.
    public boolean updateBalance() {
        Date today = new Date();

        if(checkSameDay(today)) {
            double balance = checkBalance();
            return deposit(balance * (interest / 100));
        } else {
            return false;
        }

    }

    @Override
    public boolean getDetails() {
        System.out.printf("Type: Saving Account\n");
        System.out.printf("Owner: %s\n", super.getOwner());
        System.out.printf("Balance: %.0f\n",super.getBalance());
        System.out.printf("Interest: %.0f\n",getInterest());
        System.out.printf("Date created: %s\n\n",getDateCreated());
        return true;
    }



    @Override
    public boolean withdraw(double amount) {
        Date today = new Date();

        if ( checkSameDay(today) )
            return super.withdraw(amount);

        return false;
    }

    @Override
    public boolean deposit(double amount) {
        Date today = new Date();

        if ( checkSameDay(today) )
            return super.deposit(amount);

        return false;
    }


}
