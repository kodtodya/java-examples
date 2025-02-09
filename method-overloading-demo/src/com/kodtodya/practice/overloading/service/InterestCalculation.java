package com.kodtodya.practice.overloading.service;

public class InterestCalculation {

    private static final double INTEREST_RATE = 8;

    public double calculate(int principleAmount) {
        return (principleAmount * INTEREST_RATE * 1)/100;
    }

    public double calculate(int principleAmount, int year) {
        return (principleAmount * INTEREST_RATE * year)/100;
    }

    public double calculate(int principleAmount, int year, double interestRate) {
        return (principleAmount * interestRate * year)/100;
    }
}
