package com.company;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Demo {
    public static void main(String[] args) {
        LinkedList<String> placeToVisit = new LinkedList<>();


        addInOrder(placeToVisit,"Sydney");
        addInOrder(placeToVisit,"Melbourne");
        addInOrder(placeToVisit,"Brisbane");
        addInOrder(placeToVisit,"Perth");
        addInOrder(placeToVisit,"Canberra");
        addInOrder(placeToVisit,"Adelaide");
        addInOrder(placeToVisit,"Darwin");

        printList((placeToVisit));
    }

    private static void printList(LinkedList<String> linkedList) {
        Iterator<String> i = linkedList.iterator();

        while (i.hasNext()) {
            System.out.println("Now visiting: " + i.next());
        }

        System.out.println("===========");
    }


    private static boolean addInOrder(LinkedList<String> linkedList, String newCity) {
        ListIterator<String> stringListIterator = linkedList.listIterator();

        while  (stringListIterator.hasNext()) {
            int comparison = stringListIterator.next().compareTo(newCity);

            if(comparison == 0) {
                // equal, do not add
                System.out.println(newCity + " is included as a destination");
                return false;
            } else if (comparison > 0) {
                // newCity should appear before this
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            }
        }

        stringListIterator.add(newCity);
        return true;
    }

}
