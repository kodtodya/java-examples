package com.avadhut.operator;

import java.util.Scanner;

public class LessThanEqualsToOperatorDemo {

//    Psuedo code:
//        if (no is less than and equals to 100 or not)
//        ? print good number
//	: print bad number

    public static void main(String[] args) {
        System.out.println("Please enter value:");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        if (Integer.valueOf(input) <= 100) {
            System.out.println("good number..");
        } else {
            System.out.println("bad number..");
        }
    }
}
