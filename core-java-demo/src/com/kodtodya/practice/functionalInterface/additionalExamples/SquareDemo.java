package com.kodtodya.practice.functionalInterface.additionalExamples;

public class SquareDemo {
    public static void main(String[] args) {
        Square square = (no) -> no * no;

        System.out.println("Square of 2: " + square.calculate(2));
        System.out.println("Square of 5: " + square.calculate(5));
        System.out.println("Square of 10: " + square.calculate(10));
    }
}

interface Square {
    int calculate(int no);
}
