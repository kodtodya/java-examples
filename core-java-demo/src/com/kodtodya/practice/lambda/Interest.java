package com.kodtodya.practice.lambda;

@FunctionalInterface
public interface Interest {

    double calculate(int principalAmt, float interestRate);
}
