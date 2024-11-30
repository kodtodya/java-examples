package com.kodtodya.practice.oops.vehicleAbstraction.model;

public class Truck extends Mould {
    // attributes specific to Truck
    int loadCapacity;
    String color;
    int door;
    String description;

    private static Truck truck;

    // functionalities specific to Truck
    public static Truck createTruck(int loadCapacity, String color, int door) {
        String truckDescription = createMould("truck");
        truck = new Truck(loadCapacity, color, door, truckDescription);
        return truck;
    }

    private Truck(int loadCapacity, String color, int door, String description) {
        this.loadCapacity = loadCapacity;
        this.color = color;
        this.door = door;
        this.description = description;
    }
}
