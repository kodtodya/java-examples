package com.avadhut.operator.arithmatic;

import java.util.Scanner;

public class ArithmaticOperator {

    // attributes or operands
    int firstNumber = 0;

    int secondNumber = 0;

    // behavior or methods
    void addition() {
        int total = firstNumber + secondNumber;
        System.out.println("total of 2 number is: " + total);
    }

    void subtraction() {
        int subtraction = firstNumber - secondNumber;
        System.out.println("subtraction of 2 number is: " + subtraction);
    }

    void multiplication() {
        int total = firstNumber * secondNumber;
        System.out.println("multiplication of 2 number is: " + total);
    }

    void division() {
        int division = firstNumber / secondNumber;
        System.out.println("division of 2 number is: " + division);
    }

    void modulation() {
        int modulo = firstNumber % secondNumber;
        System.out.println("Remainder of 2 number is: " + modulo);
    }

    public static void main(String[] args) {

        System.out.println("Please enter 2 values:");
        Scanner scanner = new Scanner(System.in);
        String firstInput = scanner.nextLine();
        String secondInput = scanner.nextLine();

        ArithmaticOperator arithmaticOperator = new ArithmaticOperator();
        arithmaticOperator.firstNumber = Integer.valueOf(firstInput);
        arithmaticOperator.secondNumber = Integer.valueOf(secondInput);

        arithmaticOperator.addition(); // 5 + 4 = 9
        arithmaticOperator.subtraction(); // 5-4 = 1
        arithmaticOperator.multiplication(); // 5X4 = 20

        if (arithmaticOperator.secondNumber != 0 || arithmaticOperator.firstNumber > 0) {
            arithmaticOperator.division(); // 5/4=1
            arithmaticOperator.modulation(); // 5%4 = 1
        } else {
            System.out.println(" execution without division and modulation..");
        }
    }
}