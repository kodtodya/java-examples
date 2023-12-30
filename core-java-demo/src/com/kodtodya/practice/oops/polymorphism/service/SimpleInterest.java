package com.kodtodya.practice.oops.polymorphism.service;

import com.kodtodya.practice.oops.polymorphism.contract.Interest;

public class SimpleInterest implements Interest {

    public double calculate(double interestRate, int principalAmt, int years) {
        return principalAmt * (interestRate/100) * years;
    }

    public double calculate(double interestRate, int principalAmt) {
        return principalAmt * (interestRate/100);
    }
}
