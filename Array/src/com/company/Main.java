package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int myArray[] = getArray();
	    printArray(myArray);
        System.out.println("\n\n");
        printArray(sortArray(myArray));
    }

    public static int[] getArray() {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        return array;
    }

    public static void printArray(int[] array) {
        for (int i=0; i < array.length; i++) {
            System.out.println(array[i]);
        };
    }

    public static int[] sortArray(int[] array) {
        int[] newArray = array;
        int tmp;
        for(int i=0; i<array.length;i++) {
            for(int j = i; j<array.length; j++) {
                if(newArray[i] < newArray[j]) {
                    tmp = newArray[i];
                    newArray[i] = newArray[j];
                    newArray[j] = tmp;
                }
            }
        }
        return newArray;
    }
}
