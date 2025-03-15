package com.kodtodya.practice.functionalInterface.demo;

// old-fashioned implementation
public class InterestCalculatorImpl implements InterestCalculator {
    @Override
    public double calculate(int principalAmount, double interestRate, int years) {
        return (principalAmount * interestRate / 100) * years;
    }
}
