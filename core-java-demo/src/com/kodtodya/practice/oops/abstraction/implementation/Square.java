package com.kodtodya.practice.oops.abstraction.implementation;

import com.kodtodya.practice.oops.abstraction.contract.Shape;

public class Square extends AbstractShape {
    @Override
    public void draw() {
        // write your own logic to draw the Square
        System.out.println("Square drawn.");
    }
}
