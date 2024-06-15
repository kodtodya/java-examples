package com.kodtodya.practice.oops.polymorphism.service;

import com.kodtodya.practice.oops.polymorphism.contract.Interest;

public class SimpleInterest implements Interest {

    public double calculate(double interestRate, int principalAmt, int years) {
        return calculate(interestRate, principalAmt) * years;
    }

    public double calculate(double interestRate, int principalAmt) {
        return principalAmt * (interestRate/100);
    }
}
