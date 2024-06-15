package com.kodtodya.practice.innerClazz;

public class InnerClassDemo {
    public static void main(String[] args) {
        Car.Engine engine = new Car.Engine("1.0 ltr turbo", "petrol");
        Car car = new Car(200, "mahindra","xuv300",engine);
        printCarDetails(car);
        printCarEngineDetails(car.engine);
    }

    private static void printCarDetails(Car car) {
        System.out.println("Car Details: " + car);
    }

    private static void printCarEngineDetails(Car.Engine engine) {
        System.out.println("Car Engine Details: " + engine);
    }
}
