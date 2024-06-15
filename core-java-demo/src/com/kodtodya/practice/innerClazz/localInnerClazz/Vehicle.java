package com.kodtodya.practice.innerClazz.localInnerClazz;

import com.kodtodya.practice.innerClazz.Car;

public class Vehicle {

    private int groundClearance;
    private String brand;
    private String model;
    private Engine engine;

    public Vehicle(int groundClearance, String brand, String model, String engineType, String fuelType) {
        this.groundClearance = groundClearance;
        this.brand = brand;
        this.model = model;
        // create object here
        this.engine = new Engine(engineType, fuelType);
    }

    private static class Engine {
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

    public int getGroundClearance() {
        return groundClearance;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public Engine getEngine() {
        return engine;
    }
}
