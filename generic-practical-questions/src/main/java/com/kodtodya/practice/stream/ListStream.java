package com.kodtodya.practice.stream;

import java.util.List;

public class ListStream {

    public static void main(String[] args) {

        List<Integer> integerList = List.of(5, 7, 2, 9, 34, 98, 17, 53, 90, 71, 22);

        // filter to identify unique sum numbers
        System.out.println(integerList.stream()
                .filter( no -> no%2 == 0)
                .distinct()
                .sorted()
                .toList());

        integerList.stream()
                .filter( no -> no%2 > 0)
                .sorted()
                .distinct()
                .toList()
                .listIterator()
                .forEachRemaining(System.out::println);

        List<String> cities = List.of("Pune", "Mumbai", "Delhi", "Bengaluru", "Hyderabad", "Kochi", "Ahamadabad");

        // use filter based on attribute characteristics
        cities.stream()
                .filter(city -> city.contains("u"))
                .filter(city -> city.matches("^(P|M|B).*"))
                .distinct()
                .toList()
                .forEach(System.out::println);

        // natural sorting
        cities.stream()
                .filter(city -> city.contains("u"))
                .filter(city -> city.matches("^(P|M|B).*"))
                .distinct().sorted()
                .forEach(System.out::println);

        // obtaining count
        System.out.println(cities.stream()
                .filter(city -> city.contains("u"))
                .filter(city -> city.matches("^(P|M|B).*"))
                .distinct().count());
    }

}
