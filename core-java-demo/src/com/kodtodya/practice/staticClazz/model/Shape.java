package com.kodtodya.practice.staticClazz.model;

public class Shape {

    public int radius;
    public static String type;

    // parameterized constructor
    public Shape(int radius) {
        this.radius = radius;
        System.out.println("Shape - parameterized constructor initialized...");
    }

    // no parameter constructor - default
    public Shape() {
        System.out.println("Shape - default constructor initialized...");
    }

    public void print() {
        System.out.println("Radius of this shape is: " + radius + " and shape is: " + type);
    }
}
