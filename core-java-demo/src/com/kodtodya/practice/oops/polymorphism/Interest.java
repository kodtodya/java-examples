package com.kodtodya.practice.oops.polymorphism;

public class Interest {

    public double calculate(double interestRate, int principalAmt, int years) {
        return principalAmt * (interestRate/100) * years;
    }

    public double calculate(double interestRate, int principalAmt) {
        return principalAmt * (interestRate/100);
    }
}
