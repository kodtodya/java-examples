package com.kodtodya.practice.defaultAndStaticMethods.model;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Circle drawn.");
    }

    @Override
    public void paint() {
        //Shape.super.paint();
        System.out.println("Circle painted with base color.");
    }
}
