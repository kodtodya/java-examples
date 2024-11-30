package com.kodtodya.practice.oops.polymorphism.contract;

public interface Interest {
    double calculate(double interestRate, int principalAmt, int years);

    double calculate(double interestRate, int principalAmt);
}
