package com.kodtodya.practice.loop;

import java.util.List;

public class ForEachDemo {

    public static void main(String[] args) {

        // hard-coded list
        List<Integer> items = List.of(1,2,3,4,5);

        for (Integer item: items) {
            System.out.println("Item=" + item);
        }
    }
}
