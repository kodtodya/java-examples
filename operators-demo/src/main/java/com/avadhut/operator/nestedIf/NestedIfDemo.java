package com.avadhut.operator.nestedIf;

import java.util.Scanner;

public class NestedIfDemo {
    // Pseudo code
    // print msg to enter no
    // accept no - convert to int
    // if no is positive
        // if it is positive -> check if its is even/odd - (no%2==0)
        // if it is even -> check if it is greater than 100
        // if it is odd -> check if it is less than 100
    // positive condition - else: check if no is divisible by 5

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pls enter the value: ");
        int no = Integer.parseInt(scanner.nextLine());

        if (0 <= no) {
            System.out.println("no is positive or zero");
            if (no % 2 == 0) {
                System.out.println("no is even");
                if (no > 100) {
                    System.out.println("no is greater than 100");
                } else {
                    System.out.println("no is NOT greater than 100");
                }
            } else {
                System.out.println("no is odd");
                if (no < 100) {
                    System.out.println("no is less than 100");
                } else {
                    System.out.println("no is NOT less than 100");
                }
            }
        } else {
            System.out.println("no is negative");
            if (no % 5 == 0) {
                System.out.println("no is divisible by 5");
            } else {
                System.out.println("no is NOT divisible by 5");
            }
        }

    }
}
