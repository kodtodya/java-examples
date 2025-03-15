package com.kodtodya.practice.functionalInterface.demo;

@FunctionalInterface
public interface InterestCalculator {
    double calculate(int principalAmount, double interestRate, int years);
    //double calculate(int principalAmount, double interestRate);
}
