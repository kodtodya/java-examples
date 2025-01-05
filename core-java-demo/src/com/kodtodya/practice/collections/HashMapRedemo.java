package com.kodtodya.practice.collections;

import java.util.*;

public class HashMapRedemo {
    public static void main(String[] args) {

        Map<Integer, String> cityMap = new HashMap<>();

        // put() - this will add the objects
        cityMap.put(1, "Pune");
        cityMap.put(2, "Mumbai");
        cityMap.put(3, "Delhi");

        System.out.println("Original Map: " + cityMap);
        System.out.println("-----------------------------");
        cityMap.put(3, "Kolkata");
        System.out.println("After adding duplicate key - Map: " + cityMap);

        // get() - retrieve data based on key
        System.out.println("1st key's value: " + cityMap.get(1));
        System.out.println("2nd key's value: " + cityMap.get(2));
        System.out.println("3rd key's value: " + cityMap.get(3));
        System.out.println("-----------------------------");

        // size() - retrieves size of collection
        System.out.println("CityMap.size(): " + cityMap.size());
        System.out.println("-----------------------------");

        // containsKey() - will check if key is present/not
        if (cityMap.containsKey(3)) {
            System.out.println("3rd key is present");
        } else {
            System.out.println("3rd key is NOT present");
        }

        System.out.println("-----------------------------");
        // containsValue() - will check if value is present/not
        if (cityMap.containsValue("Bengaluru")) {
            System.out.println("Bengaluru - value is present");
        } else {
            System.out.println("Bengaluru - value is NOT present");
        }

        if (cityMap.containsValue("Kolkata")) {
            System.out.println("Kolkata - value is present");
        } else {
            System.out.println("Kolkata - value is NOT present");
        }
        System.out.println("-----------------------------");

        cityMap.put(4, "Kolkata");
        // keySet() - retrieves set of keys
        System.out.println("Set<Key>: " + cityMap.keySet());

        // values() - retrieves set of values
        System.out.println("Set<Value>: " + cityMap.values());

        System.out.println("-----------------------------");
        Iterator<String> iterator = cityMap.values().iterator();
        while (iterator.hasNext()) {
            System.out.println("next value using iterator: " + iterator.next());
        }
        System.out.println("-----------------------------");

        // entryset() - retrieves set of key-value pair
        Set<Map.Entry<Integer, String>> entrySet = cityMap.entrySet();
        for (Map.Entry<Integer, String> entry : entrySet) {
            System.out.println("Key: " + entry.getKey() + " | Value: " + entry.getValue());
        }
        System.out.println("-----------------------------");

        // putAll()
        Map<Integer, String> tempCitiesMap = Map.of(4, "Jammu", 5, "Chennai");
        System.out.println("Prior to putAll(): " + cityMap);
        cityMap.putAll(tempCitiesMap);
        System.out.println("After putAll(): " + cityMap);
        System.out.println("-----------------------------");

        // remove()
        String removedValue = cityMap.remove(1);
        System.out.println("After remove(1): " + removedValue);
        System.out.println("After remove(1) - remaining Map: " + cityMap);
        System.out.println("-----------------------------");

        Enumeration<String> cityEnum = Collections.enumeration(cityMap.values());
        while (cityEnum.hasMoreElements()) {
            System.out.println("Next element using enumerator:" + cityEnum.nextElement());
        }
        System.out.println("-----------------------------");

        // clear()
        System.out.println("Before clear() - Map: " + cityMap);
        cityMap.clear();
        System.out.println("After clear() - Map: " + cityMap);
    }
}
