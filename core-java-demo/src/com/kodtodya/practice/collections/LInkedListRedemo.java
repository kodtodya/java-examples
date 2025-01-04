package com.kodtodya.practice.collections;

import java.util.LinkedList;
import java.util.List;

public class LInkedListRedemo {
    public static void main(String[] args) {
        List<String> flowers = new LinkedList<>();

        System.out.println("Size of list:" + flowers.size());

        if (flowers.isEmpty()) {
            flowers.addAll(List.of("rose", "jasmin", "lotus"));
        } else {
            System.out.println("list is not empty");
        }
        System.out.println("Now list: " + flowers);

    }
}
