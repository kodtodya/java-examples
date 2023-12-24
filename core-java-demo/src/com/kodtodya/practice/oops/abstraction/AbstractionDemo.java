package com.kodtodya.practice.oops.abstraction;

import com.kodtodya.practice.oops.abstraction.contract.Shape;
import com.kodtodya.practice.oops.abstraction.implementation.AbstractShape;
import com.kodtodya.practice.oops.abstraction.implementation.Circle;
import com.kodtodya.practice.oops.abstraction.implementation.Rectangle;
import com.kodtodya.practice.oops.abstraction.implementation.Square;

public class AbstractionDemo {

    public static void main(String[] args) {

        // data hiding with interface
        Shape shape = new Circle();
        shape.draw();

        shape = new Square();
        shape.draw();

        shape = new Rectangle();
        shape.draw();

        System.out.println("--------------------------------");
        // data hiding with abstract class
        AbstractShape abstractShape = new Circle();
        abstractShape.draw();;

        abstractShape = new Rectangle();
        abstractShape.draw();

        abstractShape = new Square();
        abstractShape.draw();
    }
}
