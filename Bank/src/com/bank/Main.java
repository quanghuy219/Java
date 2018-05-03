package com.bank;


public class Main {

    public static void main(String[] args) {
        //Initiate and use methods for a checking account
        CheckingAccount checkingAcc = new CheckingAccount("Pham Quang Huy", 10000000);


        //Initiate and use methods for a saving account
        SavingAccount savingAcc = new SavingAccount("Pham Quang Huy", 5000000);

        SavingAccount.setInterest(6);


        //Initiate and use methods for a credit account
        CreditAccount creditAcc = new CreditAccount("Pham Quang Huy", 2000000);

        //Upcasting
        Account account1 = checkingAcc;
        account1.getDetails();
        System.out.println("\n\n");

        Account account2 = savingAcc;
        account2.getDetails();

        //Dowcasting
        CheckingAccount newChecking = (CheckingAccount) account1;
        SavingAccount newSaving = (SavingAccount) account2;


        // New Vietin Bank
        Bank VietinBank = new Bank("VietinBank", "Hai Ba Trung");
        VietinBank.addAccount(account1);
        VietinBank.addAccount(account2);

        VietinBank.printAllAccount();

    }
}


