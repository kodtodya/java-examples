package com.kodtodya.practice.oops.vehicleAbstraction.model;

public abstract class Mould {
    String metal;
    int height;
    int width;
    int breadth;
    String type;

    public static String createMould(String type) {
        return "nice " + type + " object is created";
    }
}
