package com.kodtodya.practice.defaultAndStaticMethods;

import com.kodtodya.practice.defaultAndStaticMethods.model.Circle;
import com.kodtodya.practice.defaultAndStaticMethods.model.Shape;
import com.kodtodya.practice.defaultAndStaticMethods.model.Square;

public class DefaultAndStaticMethodDemo {
    public static void main(String[] args) {
        Shape shape = new Circle();
        shape.draw();
        shape.paint();
        Shape.erase();

        System.out.println("---------------------------");
        shape = new Square();
        shape.draw();
        shape.paint();
        Shape.erase();
    }
}
