package com.kodtodya.practice.collections.illustration;

import java.util.*;

public class CarListDemo {

    public static void main(String[] args) {

        Car nexon = new Car();
        nexon.brand = "tata";
        nexon.model = "xz+";
        nexon.manufacturingYear = 2023;

        Car threeX0 = new Car();
        threeX0.manufacturingYear = 2024;
        threeX0.brand = "mahindra";
        threeX0.model = "sport";

//        List<Car> myCarList = new ArrayList<>();
//        myCarList.add(nexon);
//        myCarList.add(threeX0);

//        Set<Car> myCarSet = new HashSet<>();
//        myCarSet.add(nexon);
//        myCarSet.add(threeX0);

        Map<Integer, Car> myCarMap = new HashMap<>();
        myCarMap.put(1, nexon);
        myCarMap.put(2, threeX0);
        for (Map.Entry<Integer, Car> carEntry : myCarMap.entrySet()) {
            System.out.println("I have this car: with carId as " + carEntry.getKey() + " and carDetails as: " + carEntry.getValue());
        }
    }
}