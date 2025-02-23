package com.kodtodya.practice.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CollectionsDemo {
    public static void main(String[] args) {

        List<Integer> numberList = new ArrayList<>();
        Collections.addAll(numberList, 54, 65,1239, 98, 9872, 16407, 258,2741, 87);

        System.out.println("Lowest number in list: " + Collections.min(numberList));
        System.out.println("Highest number in list: " + Collections.max(numberList));

        // sort : sorting the elements in ascending order
        Collections.sort(numberList);
        System.out.println("Sorted list: " + numberList);
        // reverse : list elements will be reversed from index point of view
        Collections.reverse(numberList);
        System.out.println("Reverse list: " + numberList);

        // swap: exchange the positions of list
        Collections.swap(numberList, 0, 1);
        System.out.println("Swap operation: " + numberList);

        // rotate: to rotate the elements based on distance
        Collections.rotate(numberList, 3);
        System.out.println("Rotate operation: " + numberList);

        System.out.println("Current List: " + numberList);

        // replaceAll() - replaces existing values with new values
        Collections.replaceAll(numberList, 87, 19);
        System.out.println("replaceAll operation: " + numberList);

        // shuffle: random sequence will be applied
        Collections.shuffle(numberList);
        System.out.println("Current List after shuffle: " + numberList);

        System.out.println("---------------------------------------------");
        for (int index = 0; index < numberList.size(); index++) {
            System.out.println("Next Element in the list: " + numberList.get(index));
            if (index == 3) {
                numberList.add(99999);
            }
        }
        System.out.println("Current list: " + numberList);

        System.out.println("-----------------------------");
        try {
            Iterator<Integer> numbersIterator = numberList.iterator();
            while (numbersIterator.hasNext()) {
                int currentNo = numbersIterator.next();
                System.out.println("next element in newCitiesList: " + currentNo);
                numberList.add(currentNo + 1);
            }
        } catch (Exception exception) {
            CopyOnWriteArrayList copyOnWriteNumberList = new CopyOnWriteArrayList();
            copyOnWriteNumberList.addAll(numberList);
            Iterator<Integer> copyOnWriteNumberListIterator = copyOnWriteNumberList.iterator();
            while (copyOnWriteNumberListIterator.hasNext()) {
                int currentNo = copyOnWriteNumberListIterator.next();
                System.out.println("next element in newCitiesList: " + currentNo);
                copyOnWriteNumberList.add(currentNo + 1);
            }
        }
        System.out.println("---------------------------------------------");
        // nCopies: creates a copy of provided collection for number of times
        System.out.println("nCopies output: " + Collections.nCopies(2, numberList));
    }
}
