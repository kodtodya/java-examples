package com.kodtodya.practice.model;

public class Bike {
    private int bikeId;
    private String make;
    private String color;

    // Rile#4 - Mark the bike as static
    private static Bike bike;

    // Rule#3 - Dont allow any method to set the attributes of class

    // Rule#1 - make your constructor private
    private Bike(int bikeId, String make, String color) {
        this.bikeId = bikeId;
        this.make = make;
        this.color = color;
    }

    // Rule#2 - Provide getter method for object
    public static synchronized Bike getBike(int bikeId, String make, String color) {

        // Rule#5 - create object only once
        if (bike == null) {
            bike = new Bike(bikeId, make, color);
        } else {
            bike.bikeId = bikeId;
            bike.make = make;
            bike.color = color;
        }
        return bike;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "bikeId=" + bikeId +
                ", make='" + make + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
