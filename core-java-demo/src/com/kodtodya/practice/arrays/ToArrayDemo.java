package com.kodtodya.practice.arrays;
import java.util.*;

public class ToArrayDemo {

    public static void main(String[] args){

        // Example
        List<String> cities = new ArrayList<String>();

        cities.add("Pune");
        cities.add("Mumbai");
        cities.add("Delhi");
        cities.add("Bangaluru");
        cities.add("Chennai");
        cities.add("Kolkata");

        // old method till java-7
        System.out.println("List to Cities prior to Java 8:");
        Object[] citiObjects = cities.toArray();
        System.out.println(Arrays.toString(citiObjects));

        // new method in java-8
        System.out.println("List to Cities in Java 8:");
        String[] java8Cities = cities.toArray(new String[cities.size()]);
        System.out.println(Arrays.toString(java8Cities));

        // old method in java-8
        String[] java8CitiesArray = cities.toArray(new String[cities.size()]);
        System.out.println(Arrays.toString(java8CitiesArray));

        // new method in java-11
        System.out.println("List to Cities in Java 11:");
        String[] java11Cities = cities.toArray(String[]::new);
        System.out.println(Arrays.toString(java11Cities));

        var citySet = new HashSet<String>(cities);
        citySet.remove("Kolkata");
        citySet.add("Hyderabad");

        var finalCityArray = citySet.toArray(String[]::new);
        System.out.println(Arrays.toString(finalCityArray));


        // Another exaple with integer
        List<Integer> numbersList = List.of(1, 2, 3, 4, 5);

        // old method till java-7
        System.out.println("List to Numbers prior to Java 8:");
        Object[] numberObjects = numbersList.toArray();
        System.out.println(Arrays.toString(numberObjects));

        // new method in java-8
        System.out.println("List to Cities in Java 8:");
        Integer[] java8Numbers = numbersList.toArray(new Integer[numbersList.size()]);
        System.out.println(Arrays.toString(java8Numbers));

        // new method in java-11
        System.out.println("List to Cities in Java 11:");
        Integer[] numberArray = numbersList.toArray(Integer[]::new);
        System.out.println(Arrays.toString(numberArray));

        Set<Integer> numberSet = new LinkedHashSet<>(numbersList);
        numberSet.remove(1);
        numberSet.add(6);
        numberArray = numberSet.toArray(Integer[]::new);
        System.out.println(Arrays.toString(numberArray));

    }
}