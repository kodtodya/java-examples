package com.kodtodya.practice.staticClazz;

public class Shape {

    int radius;
    static String type;

    // parameterized constructor
    Shape(int radius) {
        this.radius = radius;
        System.out.println("Shape - parameterized constructor initialized...");
    }

    // no parameter constructor - default
    Shape() {
        System.out.println("Shape - default constructor initialized...");
    }

    public void print() {
        System.out.println("Radius of this shape is: " + radius + " and shape is: " + type);
    }
}
