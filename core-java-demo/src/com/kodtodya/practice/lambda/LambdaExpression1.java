package com.kodtodya.practice.lambda;

public class LambdaExpression1 {
    public static void main(String[] args) {

        Interest interest = (int principalAmt, float interestRate) -> principalAmt * (interestRate /100);

        int principalAmt = 1000;
        float interestRate = 8.5f;
        double simpleInterest = interest.calculate(principalAmt, interestRate);
        System.out.println("Simple Interest: " + simpleInterest);
    }
}
