package com.kodtodya.practice.enums;

public class Address {
    String city;
    int pincode;
    Direction direction;

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", pincode=" + pincode +
                ", direction=" + direction +
                '}';
    }
}

enum Direction {
    EAST, WEST, SOUTH, NORTH
}
