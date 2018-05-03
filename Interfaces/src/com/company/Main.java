package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Player huy = new Player("Huy", 100, 100);

        System.out.println(huy.toString());
        saveObject(huy);

        huy.setHitPoints(999);
        System.out.println(huy);
        huy.setWeapon("Hammer");
        saveObject(huy);
        //loadObject(huy);
        System.out.println(huy);


        IInterface werewolf = new Monster("Wolverin", 200,200);
        System.out.println(werewolf);
        saveObject(werewolf);

    }

    public static ArrayList<String> readValues() {
        ArrayList<String> values = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("1. Enter a string\n" +
                            "0. Quit");

        while (!quit) {
            System.out.println("Choose an option");
            int choice = sc.nextInt();
            sc.nextLine();
            switch(choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.println("Enter a string: ");
                    String inputString = sc.nextLine();
                    values.add(index, inputString);
                    index++;
                    break;
            }
        }
        return values;
    }

    public static void saveObject(IInterface objectToSave) {
        for (int i = 0; i < objectToSave.write().size(); i++) {
            System.out.println("Saving " + objectToSave.write().get(i) + " to storage device");
        }

    }

    public static void loadObject(IInterface objectToLoad) {
        List<String> values = readValues();
        objectToLoad.read(values);
    }
}
