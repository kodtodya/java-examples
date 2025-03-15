package com.kodtodya.practice.lambda;

public class LambdaWithLocalVariableDemo {
    public static void main(String[] args) {
        Interest interest = (principalAmt, interestRate) -> {
            int years = 10;
            return principalAmt * (interestRate / 100) * years;
        };

        double totalInterest = interest.calculate(25000, 8.1f);
        System.out.println("Total interest: " + totalInterest);
    }
}
