package com.avadhut.operator;

import java.util.Scanner;

public class BitwiseOrOperatorDemo {

    // attributes or operands
    static int firstNumber = 0;

    static int secondNumber = 0;

    // behavior or methods
    private static void bitwiseOrOperation() {
        int result = firstNumber | secondNumber;
        System.out.println("bitwise OR result: " + result);
    }

    public static void main(String[] args) {

        System.out.println("Please enter 2 values:");
        Scanner scanner = new Scanner(System.in);
        firstNumber = Integer.valueOf(scanner.nextLine());
        secondNumber = Integer.valueOf(scanner.nextLine());

        bitwiseOrOperation();
    }
}