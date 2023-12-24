package com.kodtodya.practice.oops.abstraction.implementation;

import com.kodtodya.practice.oops.abstraction.contract.Shape;

public abstract class AbstractShape implements Shape {

    public void draw() {
        // logic for your base setup/work/task/implementation
        System.out.println("Base shape drawn.");
    }
}
