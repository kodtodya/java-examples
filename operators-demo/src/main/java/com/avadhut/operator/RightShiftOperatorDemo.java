package com.avadhut.operator;

import java.util.Scanner;

public class RightShiftOperatorDemo {

//    Pseudo code: program to shift the bit by 2 to right.

    public static void main(String[] args) {
        System.out.println("Please enter value:");
        Scanner scanner = new Scanner(System.in);
        int input = Integer.valueOf(scanner.nextLine());

        System.out.println("result: " + (input >> 2));
    }
}
