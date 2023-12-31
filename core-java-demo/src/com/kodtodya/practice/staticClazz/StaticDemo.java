package com.kodtodya.practice.staticClazz;

import com.kodtodya.practice.staticClazz.model.Shape;
import static com.kodtodya.practice.staticClazz.model.Shape.type;

public class StaticDemo {
    public static void main(String[] args) {
        type = "Circle";

        // circle 1 illustration
        Shape circle1 = new Shape();
        circle1.radius = 5;
        circle1.print();

        // circle 2 illustration
        Shape circle2 = new Shape(8);
        circle2.print();

        // circle 3 illustration
        Shape circle3 = new Shape(9);
        circle3.print();
    }
}
