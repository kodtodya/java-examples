package com.kodtodya.practice.oops.inheritance.service;

public class ShapeDemo {
    public static void main(String[] args) {
        BaseShape baseShape = new BaseShape("yellow");
        baseShape.draw();

        System.out.println("----------------------------");
        baseShape = new Circle(); // data hiding
        baseShape.draw();
    }
}
