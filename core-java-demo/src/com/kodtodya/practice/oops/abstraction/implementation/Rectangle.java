package com.kodtodya.practice.oops.abstraction.implementation;

import com.kodtodya.practice.oops.abstraction.contract.Shape;

public class Rectangle extends AbstractShape {
    @Override
    public void draw() {
        // write your own logic to draw the rectangle
        System.out.println("Rectangle drawn.");
    }
}
