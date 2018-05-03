package com.company;

import java.util.ArrayList;

public class MobilePhone {
    private ArrayList<Contact> phone = new ArrayList<Contact>();

    public ArrayList<Contact> getPhone() {
        return phone;
    }

    public void printMobilePhoneContact() {
        System.out.println("You have " + phone.size() + " in Contacts");
        for (int i=0; i < phone.size(); i++) {
            System.out.println(phone.get(i).getName() + "\t" + phone.get(i).getNumber());
        }
    }

    public void addMobilePhoneContact(String name, String number) {
        Contact newContact = findMobilePhoneContact(name);
        if (newContact == null) {
            newContact = new Contact(name, number);
            phone.add(newContact);
        }
        else System.out.println("Contact exists in the list");
    }

    private Contact findMobilePhoneContact(String name) {
        for (int i=0; i < phone.size(); i++) {
            if (phone.get(i).getName().equals(name)) return phone.get(i);
        }
        return null;
    }

    public void modifyMobilePhoneContact(String name, String number) {
        Contact searchContact = findMobilePhoneContact(name);
        if (searchContact == null) System.out.println("Contact doesn't exist");
        else {
            searchContact.setNumber(number);
            System.out.println("Number for " + name + " has been set");
        }
    }

    public void removeMobilePhoneContact(String name) {
        Contact removeContact = findMobilePhoneContact(name);
        phone.remove(removeContact);
    }

    public void queryMobilePhoneContact(String name) {
        Contact newContact = findMobilePhoneContact(name);
        if (newContact == null) System.out.println(name + " doesnt exist");
        else {
            System.out.println(newContact.getName() + "\t" + newContact.getNumber());
        }
    }
}
