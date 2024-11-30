package com.kodtodya.practice.innerClazz.localInnerClazz;

import com.kodtodya.practice.innerClazz.Car;

public class LocalInnerClassDemo {
    public static void main(String[] args) {
        Vehicle truck = new Vehicle(400, "tata","400","3.0 ltr turbo", "diesel");

        printTruckDetails(truck);
        printTruckEngineDetails(truck.getEngine());
    }

    private static void printTruckDetails(Vehicle truck) {
        System.out.println("Truck Details: " + truck);
    }

    private static void printTruckEngineDetails(Object engine) {
        System.out.println("Truck Engine Details: " + engine);
    }
}
