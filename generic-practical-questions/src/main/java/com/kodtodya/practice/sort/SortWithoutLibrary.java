package com.kodtodya.practice.sort;

import java.util.List;

public class SortWithoutLibrary {

    public int getSecondHighest(List<Integer> integers) {
        int highest = Integer.MIN_VALUE, secondHighest = Integer.MIN_VALUE;

        for (Integer item : integers) {
            if (item > highest) {
                secondHighest = highest;
                highest = item;
            }
        }
        return secondHighest;
    }

    public int getHighest(List<Integer> integers) {
        int highest = Integer.MIN_VALUE;

        for (Integer item : integers) {
            if (item > highest) {
                highest = item;
            }
        }
        return highest;
    }

    public static void main(String[] args) {
        List<Integer> integerList = List.of(1, 3, 5, 7, 9, 10);
        SortWithoutLibrary sortWithoutLibrary = new SortWithoutLibrary();
        System.out.println("Second Highest Value: " + sortWithoutLibrary.getSecondHighest(integerList));
        System.out.println("Highest Value: " + sortWithoutLibrary.getHighest(integerList));
    }
}
