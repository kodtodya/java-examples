package com.kodtodya.practice.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapRedemo {
    public static void main(String[] args) {

        Map<Integer, String> cityMap = new HashMap<>();

        cityMap.put(1, "Pune");
        cityMap.put(2, "Mumbai");
        cityMap.put(3, "Delhi");

        System.out.println("Original Map: " + cityMap);
        System.out.println("-----------------------------");
        cityMap.put(3, "Kolkata");
        System.out.println("After adding duplicate key - Map: " + cityMap);
    }
}
