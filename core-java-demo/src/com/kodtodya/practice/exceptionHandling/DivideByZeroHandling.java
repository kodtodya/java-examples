package com.kodtodya.practice.exceptionHandling;

public class DivideByZeroHandling {
    public static void main(String[] args) {
        int no1=10, no2=0;

        int division = 0;

        try {
            division = no1/no2;
        } catch (Exception e) {
            System.err.println("Division values must not be zero.");
            //System.exit(0);
        }

        System.out.println("Division: " + division);
    }
}
