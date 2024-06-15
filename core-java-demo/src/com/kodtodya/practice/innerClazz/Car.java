package com.kodtodya.practice.innerClazz;

public class Car {

    int groundClearance;
    String brand;
    String model;

    Engine engine;

    public Car(int groundClearance, String brand, String model, Engine engine) {
        this.groundClearance = groundClearance;
        this.brand = brand;
        this.model = model;
        this.engine = engine;
    }

    public static class Engine {
        String engineType;
        String fuelType;

        public Engine(String engineType, String fuelType) {
            this.engineType = engineType;
            this.fuelType = fuelType;
        }

        @Override
        public String toString() {
            return "Engine{" +
                    "engineType='" + engineType + '\'' +
                    ", fuelType='" + fuelType + '\'' +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "groundClearance=" + groundClearance +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engine=" + engine +
                '}';
    }
}
