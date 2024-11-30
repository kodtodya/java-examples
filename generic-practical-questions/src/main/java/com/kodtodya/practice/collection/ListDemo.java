package com.kodtodya.practice.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        // Creating an ArrayList of Integer type
        List<Integer> arrayList = new ArrayList<>();

        // Appending the new elements at the end of the list
        // using add() method via for loops
        for (int i = 1; i <= 5; i++)
            arrayList.add(i);

        // Printing the ArrayList
        System.out.println(arrayList);

        // Removing an element at index 3 from the ArrayList
        // using remove() method
        arrayList.remove(3);

        // Printing the ArrayList after removing the element
        System.out.println(arrayList);

        System.out.println("Printing same arraylist using iterator:");
        Iterator<Integer> listIterator = arrayList.iterator();
        while (listIterator.hasNext()) {
            System.out.print(listIterator.next() + "\t");
        }

        System.out.println("\nPrinting same arraylist using for loop:");
        for (Integer i : arrayList) {
            System.out.print(i + "\t");
        }

        System.out.println("\nPrinting same arraylist using stream().forEachOrdered():");
        arrayList.stream().forEach(item -> System.out.print(item + "\t"));
    }
}
