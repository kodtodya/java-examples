package com.kodtodya.practice.oops.polymorphism;

public class MethodOverloadingDemo {

    public static void main(String[] args) {
        Interest interest = new Interest();
        System.out.println("Interest for one year: " + interest.calculate(8.6, 10000));
        System.out.println("Interest for 5 year: " + interest.calculate(8.6, 10000, 5));
    }
}
