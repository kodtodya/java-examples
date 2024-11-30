package com.kodtodya.practice.oops.vehicleAbstraction.service;

import com.kodtodya.practice.oops.abstraction.contract.Shape;
import com.kodtodya.practice.oops.abstraction.implementation.AbstractShape;
import com.kodtodya.practice.oops.abstraction.implementation.Circle;
import com.kodtodya.practice.oops.abstraction.implementation.Rectangle;
import com.kodtodya.practice.oops.abstraction.implementation.Square;
import com.kodtodya.practice.oops.vehicleAbstraction.model.Car;
import com.kodtodya.practice.oops.vehicleAbstraction.model.Mould;

public class AbstractionDemo {

    public static void main(String[] args) {

        // data hiding with interface
        Mould car = Car.createCar(5, "white", 3);

        System.out.println("Car object created: " + car);
    }
}
