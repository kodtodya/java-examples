package com.avadhut.operator.bitwise;

import java.util.Scanner;

public class BitwiseAndOperatorDemo {

    // attributes or operands
    static int firstNumber;

    static int secondNumber;

    // behavior or methods
    private static void bitwiseAndOperation() {
        int result = firstNumber & secondNumber;
        System.out.println("bitwise AND result: " + result);
    }

    public static void main(String[] args) {

        System.out.println("Please enter 2 values:");
        Scanner scanner = new Scanner(System.in);
        firstNumber = Integer.parseInt(scanner.nextLine());
        secondNumber = Integer.parseInt(scanner.nextLine());

        bitwiseAndOperation();
    }
}