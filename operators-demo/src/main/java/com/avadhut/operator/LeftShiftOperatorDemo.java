package com.avadhut.operator;

import java.util.Scanner;

public class LeftShiftOperatorDemo {

//    Pseudo code: program to shift the bit by 4 to left.

    public static void main(String[] args) {
        System.out.println("Please enter value:");
        Scanner scanner = new Scanner(System.in);
        int input = Integer.valueOf(scanner.nextLine());

        System.out.println("result: " + (input << 4));
    }
}
