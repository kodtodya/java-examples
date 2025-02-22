package com.kodtodya.practice.stream;

import java.util.*;

public class StreamSamples {

    public static void main1(String[] args) {

        // collection improvements
        // old-fashioned
        List<String> oldMsgs = new ArrayList<>();
        oldMsgs.add("hi");
        oldMsgs.add("hello");
        oldMsgs.add("how");
        oldMsgs.add("are");
        oldMsgs.add("you");

        // modern
        List<String> blankList = List.of();
        List<String> messages = List.of("hi", "hello", "how","are","you");

        // for-each loop - old-fashioned
        for (String msg : messages) {
            System.out.println("msg: " + msg);
        }
        // modern
        //messages.forEach(System.out::println);
        StreamSamples streamSamples = new StreamSamples();
        messages.forEach(streamSamples::print);

        Set<String> blankSet = Set.of();
        Set<String> testSet = Set.of("hi", "hello", "how","are","you");
        testSet.forEach(System.out::println);

        Map<Integer, String> blankMap = Map.of();
        Map<Integer, String> dataMap = Map.of(1, "hi", 2,"hello", 3, "how");
        dataMap.forEach((key, value) -> System.out.println("key: " + key + "|value:" + value));
    }

    public void print(String element) {
        System.out.println("Element: " + element);
    }

    public void printList(List tempList) {
        tempList.forEach(System.out::println);
    }

    public static void main(String...args) {
        List<String> cities = List.of("pune", "mumbai", "delhi","nashik","bangalore");

        List<String> filteredCities = cities.stream().parallel()
                .filter(city -> city.contains("a"))
                .map(city -> city.substring(0, 2))
                .toList();

        System.out.println(filteredCities);
        System.out.println(cities.stream().parallel()
                .filter(city -> city.contains("a"))
                .map(city -> city.substring(0, 2))
                .findAny());
    }
}
