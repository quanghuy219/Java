package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner sc = new Scanner(System.in);
    private static MobilePhone phone = new MobilePhone();

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstructions();

        while(!quit) {
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch(choice) {
                case 1:
                    printInstructions();
                    break;
                case 2:
                    phone.printMobilePhoneContact();
                    break;
                case 3:
                    addItem();
                    break;
                case 4:
                    modifyItem();
                    break;
                case 5:
                    removeItem();
                    break;
                case 6:
                    searchForItem();
                    break;
                case 0:
                    quit = true;
                    break;
            }
        }

    }

    public static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\t 1 - To print choice option");
        System.out.println("\t 2 - To print list");
        System.out.println("\t 3 - To add an item");
        System.out.println("\t 4 - To modify an item");
        System.out.println("\t 5 - To remove an item");
        System.out.println("\t 6 - To search for an item");
        System.out.println("\t 0 - To quite program");
    }

    public static void addItem() {
        String name;
        System.out.println("Name: ");
        name = sc.nextLine();
        System.out.println("Number: ");
        String number = sc.nextLine();
        phone.addMobilePhoneContact(name, number);
    }

    public static void modifyItem() {
        String name;
        System.out.println("Name: ");
        name = sc.nextLine();
        System.out.println("Number: ");
        String number = sc.nextLine();
        phone.modifyMobilePhoneContact(name, number);
    }

    public static void removeItem() {String name;
        System.out.println("Name: ");
        name = sc.nextLine();
        phone.removeMobilePhoneContact(name);
    }

    public static void searchForItem() {
        String name;
        System.out.println("Name: ");
        name = sc.nextLine();
        phone.queryMobilePhoneContact(name);
    }
}
