package com.avadhut.operator;

import java.util.Scanner;

public class ExactEqualsToOperatorDemo {

//    Psuedo code:
//        if (no is exact equals to 100 or not)
//        ? print good number
//	: print bad number

    public static void main(String[] args) {
        System.out.println("Please enter value:");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        if (Integer.valueOf(input) == 100) {
            System.out.println("matching - century");
        } else {
            System.out.println("non-matching - non-century");
        }
    }
}
