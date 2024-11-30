package com.avadhut.operator;

import java.util.Scanner;

public class UnaryOperator {

    // attributes or operands
    int number = 0;

    // behavior or methods
    void preIncrement(int input) {
        System.out.println("preIncrement: " + ++input);
        System.out.println("after preIncrement: " + input);
    }

    void postIncrement(int input) {
        System.out.println("postIncrement: " + input++);
        System.out.println("after postIncrement: " + input);
    }

    void preDecrement(int input) {
        System.out.println("preDecrement: " + --input);
        System.out.println("after preDecrement: " + input);
    }

    void postDecrement(int input) {
        System.out.println("postDecrement: " + input--);
        System.out.println("after postDecrement: " + input);
    }

    void complement(int input) {
        System.out.println("complement: " + ~input);
        System.out.println("after complement: " + input);
    }

    void negation(boolean flag) {
        System.out.println("negation: " + !flag);
    }

    public static void main(String[] args) {

        System.out.println("Please enter integer value:");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        UnaryOperator unaryOperator = new UnaryOperator();
        int no = Integer.valueOf(input);

        unaryOperator.preIncrement(no);
        unaryOperator.postIncrement(no);

        unaryOperator.preDecrement(no);
        unaryOperator.postDecrement(no);

        unaryOperator.complement(no);
        unaryOperator.negation(false);
    }
}