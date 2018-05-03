package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        //datatype for element in arrayList must be class/object
        //ArrayList<int> intArraylist = new ArrayList<int>();
    /*
        ArrayList<Integer> intArrayList = new ArrayList<Integer>();
        Integer integer = new Integer(56);
        Integer myIntvalue = 56;
        for (int i = 0; i<= 10; i++) {
            intArrayList.add(Integer.valueOf(i));
        }

        for (int i=0; i<= 10; i++) {
            System.out.println(i + " ------> " + intArrayList.get(i).intValue());
        }
        */

        Bank bank = new Bank("HSBC");
        bank.addBranch("Hanoi");
        bank.addCustomer("Hanoi", "Huy", 10000);
        bank.addCustomer("Hanoi", "Tim", 10000);
        bank.addCustomer("Hanoi", "James", 100);

        bank.addBranch("HCM");
        bank.addCustomer("HCM", "Mike", 100);
        bank.addCustomer("HCM", "Danny", 100);

        bank.addCustomerTransaction("Hanoi", "Huy", 132);
        bank.addCustomerTransaction("Hanoi", "Tim", 132);

        bank.listCustomers("Hanoi", true);
    }
}
