package com.avadhut.operator;

import java.util.Scanner;

public class TernaryOperatorDemo {

//    Pseduo code:
//    ------------
//      accept the no as input;
//      check if no is less than 0
//                  -> print negative no
//              else -> positive no

    public static void main(String[] args) {
        System.out.println("Please enter value:");
        Scanner scanner = new Scanner(System.in);
        int input = Integer.valueOf(scanner.nextLine());

        // ternary operator representation:
        System.out.println( (input < 0) ? "negative number" : "positive number");
    }
}
