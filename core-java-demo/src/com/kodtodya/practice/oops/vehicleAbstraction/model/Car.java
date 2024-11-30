package com.kodtodya.practice.oops.vehicleAbstraction.model;

public class Car extends Mould {
    // attributes specific to car
    int sittingCapacity;
    String color;
    int door;
    String description;
    static private Car car;

    // functionalities specific to car
    public static Car createCar(int sittingCapacity, String color, int door) {
        String carDescription = createMould("car");
        car = new Car(sittingCapacity, color, door, carDescription);
        return car;
    }

    private Car(int sittingCapacity, String color, int door, String description) {
        this.sittingCapacity = sittingCapacity;
        this.color = color;
        this.door = door;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Car{" +
                "sittingCapacity=" + sittingCapacity +
                ", color='" + color + '\'' +
                ", door=" + door +
                ", description='" + description + '\'' +
                '}';
    }
}
