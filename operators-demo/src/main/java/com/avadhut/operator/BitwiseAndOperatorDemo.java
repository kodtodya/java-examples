package com.avadhut.operator;

import java.util.Scanner;

public class BitwiseAndOperatorDemo {

    // attributes or operands
    static int firstNumber = 0;

    static int secondNumber = 0;

    // behavior or methods
    private static void bitwiseAndOperation() {
        int result = firstNumber & secondNumber;
        System.out.println("bitwise AND result: " + result);
    }

    public static void main(String[] args) {

        System.out.println("Please enter 2 values:");
        Scanner scanner = new Scanner(System.in);
        firstNumber = Integer.valueOf(scanner.nextLine());
        secondNumber = Integer.valueOf(scanner.nextLine());

        bitwiseAndOperation();
    }
}