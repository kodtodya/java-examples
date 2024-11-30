package com.avadhut.operator.relational;

import java.util.Scanner;

public class PositiveNegativeWithEqualsDemo {

    // Pseudo code
    // identify value is positive/negative
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pls enter the value: ");
        int no = Integer.parseInt(scanner.nextLine());

        if (0 <= no) { // >, <, >=, <=, ==, !=
            // what to do it - if section is true
            System.out.println("no is positive or zero");
        } else {
            System.out.println("no is negative");
        }
    }
}
