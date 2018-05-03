package com.company;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean newCustomer(String customerName, double inititalAmount) {
        if(findCustomer(customerName) == null) {
            this.customers.add(new Customer(customerName, inititalAmount));
            return true;
        }

        return false;
    }

    public boolean addCustomerTransaction(String name, double amount) {
        Customer existingCustomer = findCustomer(name);
        if(existingCustomer != null) {
            existingCustomer.addTrasaction(amount);
            return true;
        }

        return false;
    }

    private Customer findCustomer(String name) {
        for (int i =0; i < this.customers.size(); i++) {
            if (customers.get(i).equals(name))
                return customers.get(i);
        }

        return null;
    }
}
