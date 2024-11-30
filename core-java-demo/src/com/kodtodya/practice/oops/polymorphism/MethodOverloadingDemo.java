package com.kodtodya.practice.oops.polymorphism;

import com.kodtodya.practice.oops.polymorphism.service.SimpleInterest;

public class MethodOverloadingDemo {

    public static void main(String[] args) {
        SimpleInterest simpleInterest = new SimpleInterest();
        System.out.println("Simple Interest for one year: " + simpleInterest.calculate(8.6, 10000));
        System.out.println("Simple Interest for 5 year: " + simpleInterest.calculate(8.6, 10000, 5));
    }
}
