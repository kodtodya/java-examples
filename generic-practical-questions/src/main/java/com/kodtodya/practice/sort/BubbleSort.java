package com.kodtodya.practice.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BubbleSort {

    public List<Integer> sort(List<Integer> integerList) {
        int length = integerList.size();
        Integer[]  finalList = integerList.toArray(new Integer[length]);

        for (int counter = 0; counter < length; counter++) {

            for (int nextCounter = 1; nextCounter < length-counter; nextCounter++) {
                if (finalList[nextCounter-1] > finalList[nextCounter]) {
                    int temp = finalList[nextCounter-1];
                    finalList[nextCounter-1] = finalList[nextCounter];
                    finalList[nextCounter] = temp;
                }
            }
        }
        return Arrays.asList(finalList);
    }

    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        System.out.println(bubbleSort.sort(List.of(2, 5, 8, 9, 1, 3, 90, 65, 4, 87, 79)));
    }
}
