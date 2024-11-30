package com.kodtodya.practice;

import com.kodtodya.practice.model.Bike;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        System.out.println( "Hello World!" );

        Bike bike = Bike.getBike(1, "Honda", "white");

        System.out.println("First bike object: " + bike);
        Bike bike2 = Bike.getBike(2, "Bajaj", "Black");
        System.out.println("Second bike object: " + bike2);
    }
}
