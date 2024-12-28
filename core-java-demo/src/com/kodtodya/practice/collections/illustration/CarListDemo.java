package com.kodtodya.practice.collections.illustration;

import java.util.*;

public class CarListDemo {

    private static HashMap<Integer, Car> myCarMap = new HashMap<>();
    private static List<Car> myCarList = new ArrayList<>();
    private static Set<Car> myCarSet = new HashSet<>();
    private static int counter = 0;

    public static void main(String[] args) {

        Car nexon = new Car();
        nexon.brand = "tata";
        nexon.model = "xz+";
        nexon.manufacturingYear = 2023;

        Car threeX0 = new Car();
        threeX0.manufacturingYear = 2024;
        threeX0.brand = "mahindra";
        threeX0.model = "sport";

        Car modelY = new Car();
        modelY.manufacturingYear = 2021;
        modelY.brand = "tesla";
        modelY.model = "y";

        addCarsToMap(nexon, threeX0, modelY, threeX0, modelY);
//        addCarsToList(nexon, threeX0, modelY, threeX0, modelY);
//        addCarsToSet(nexon, threeX0, modelY, threeX0, modelY);
//
//        for(Car car: myCarList) {
//            System.out.println("inside list: " + car);
//        }
//
//        for(Car car: myCarSet) {
//            System.out.println("inside set: " + car);
//        }

        for (Map.Entry<Integer, Car> carEntry : myCarMap.entrySet()) {
            System.out.println("I have this car: with carId as " + carEntry.getKey() + " and carDetails as: " + carEntry.getValue());
        }
    }

    private static void addCarsToMap(Car... cars) {
        for (Car car : cars) {
            myCarMap.put(++counter, car);
        }
    }

    private static void addCarsToList(Car... cars) {
        for (Car car : cars) {
            myCarList.add(car);
        }
    }

    private static void addCarsToSet(Car... cars) {
        for (Car car : cars) {
            myCarSet.add(car);
        }
    }
}