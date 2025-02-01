package com.kodtodya.practice.collections;

import java.util.*;

public class CollectionsRedemo {
    public static void main(String[] args) {
        List<Integer> numberList = new ArrayList<>();
        // addAll()
        Collections.addAll(numberList, 56, 67,778,3453,3463,346457,678,897742);
        System.out.println("List<Integer>:" + numberList);

        Collections.sort(numberList);
        System.out.println("Sorted List<Integer>:" + numberList);
        System.out.println("Min(List<Integer>):" + Collections.min(numberList));
        System.out.println("Max(List<Integer>):" + Collections.max(numberList));

        System.out.println("--------------------------------------------");
        Collections.reverse(numberList);
        System.out.println("Reverse(List<Integer>):" + numberList);
        Collections.swap(numberList, 0, 2);
        System.out.println("Swapped(List<Integer>):" + numberList);
        boolean isReplaced = Collections.replaceAll(numberList, 3463, 2222);
        if (isReplaced) {
            System.out.println("Replaced list: " + numberList);
        } else {
            System.out.println("Nothing was replaced and here is the list: " + numberList);
        }

        Collections.shuffle(numberList);
        System.out.println("Shuffled list: " + numberList);

        System.out.println("--------------------------------------------");
        Collections.rotate(numberList, 3);
        System.out.println("Rotate operation: " + numberList);

        List<List<Integer>> listOfList= Collections.nCopies(2, numberList);
        System.out.println("2 copies of existing list: " + listOfList);
    }
}
