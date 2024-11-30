package com.kodtodya.practice.lambda;

import java.util.*;
import java.util.stream.Collectors;

public class LambdaCollectionDemo {
    public static void main(String[] args) {
        List<String> listData = generateListData();

        // Pseudocode:
        // 1. iterate over list
        // 2. for every city, calculate the length
        // 3. for every city, add entry to Map where key=city and value=length
        // 4. print that map at last

        // old fashion
        Map<String,Integer> logicalMap = new HashMap<>();
        for (String city : listData) {
            int length = city.length();
            logicalMap.put(city, length);
        }
        Iterator<Map.Entry<String, Integer>> iterator = logicalMap.entrySet().iterator();
        while(iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println("Entry: " + entry.getKey() + "|" + entry.getValue());
        }

        System.out.println("--------------------------------------");

        // modern coding
        listData.parallelStream()
                .collect(Collectors.toMap(
                        city -> city,
                        String::length
                )).forEach((key, value) -> System.out.println("Entry: " + key + "|" + value));
    }

    private static List<String> generateListData() {
        List<String> cities = new ArrayList<>();
        //Adding cities
        cities.add("Pune");
        cities.add("Mumbai");
        cities.add("Delhi");
        cities.add("Satara");
        cities.add("Ahmadabad");
        cities.add("Chennai");
        cities.add("Bengaluru");
        return cities;
    }
}
