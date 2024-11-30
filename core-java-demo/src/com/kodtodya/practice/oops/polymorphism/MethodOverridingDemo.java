package com.kodtodya.practice.oops.polymorphism;

import com.kodtodya.practice.oops.polymorphism.service.CompoundInterest;

public class MethodOverridingDemo {

    public static void main(String[] args) {
        CompoundInterest compoundInterest = new CompoundInterest();
        System.out.println("Compound Interest for one year: " + compoundInterest.calculate(8.6, 10000));
        System.out.println("Compound Interest for 5 year: " + compoundInterest.calculate(8.6, 10000, 5));
    }
}
