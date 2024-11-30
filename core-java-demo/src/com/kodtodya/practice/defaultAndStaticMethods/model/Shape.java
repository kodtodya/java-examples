package com.kodtodya.practice.defaultAndStaticMethods.model;

public interface Shape {

    void draw();

    default void paint() {
        System.out.println("base painting done.");
    }

    static void erase() {
        System.out.println("Base shape has been erased.");
    }
}
