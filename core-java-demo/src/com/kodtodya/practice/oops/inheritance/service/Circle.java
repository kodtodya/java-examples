package com.kodtodya.practice.oops.inheritance.service;

public class Circle extends BaseShape {

    public Circle(String color) {
        super(color);
    }

    public Circle() {
        super("white");
    }

    public void draw() {
        System.out.println("circle drawn with " + this.color);
    }
}
