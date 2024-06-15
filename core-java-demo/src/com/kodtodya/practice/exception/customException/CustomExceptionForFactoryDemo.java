package com.kodtodya.practice.exception.customException;

public class CustomExceptionForFactoryDemo {
    public static void main(String[] args) {
        Factory semiconductorFactory = null, shoeFactory = null;
        try {
            semiconductorFactory = new Factory("Semiconductor", "nashik");
            System.out.println("Semiconductor Factory details are: " + semiconductorFactory);

            shoeFactory = new Factory("Shoe", "Delhi");
            System.out.println("Shoe Factory details are: " + shoeFactory);
        } catch (FactoryLocationNotFoundException e) {
            System.err.println(e.getMessage());
        }
    }
}
