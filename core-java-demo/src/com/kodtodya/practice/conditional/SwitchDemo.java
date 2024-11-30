package com.kodtodya.practice.conditional;

import java.util.Scanner;

public class SwitchDemo {

    // Psuedo Code:
    // accept the no
    // print the no in words
    public static void main(String[] args) {
        int input = acceptNumber();
        printNumber(input);
    }

    private static int acceptNumber() { // access_specifier return_type method_name(params)
        System.out.println("Please enter value:");
        Scanner scanner = new Scanner(System.in);
        int input = Integer.valueOf(scanner.nextLine());
        return input;
    }

    private static void printNumber(int no) {
        switch (no) {
            case 0:
                System.out.println( "zero");
                break;
            case 1:
                System.out.println( "one");
                break;
            case 2:
                System.out.println( "two");
                break;
            case 3:
                System.out.println( "three");
                break;
            case 4:
                System.out.println( "four");
                break;
            case 5:
                System.out.println( "five");
                break;
            case 6:
                System.out.println( "six");
                break;
            case 7:
                System.out.println( "seven");
                break;
            case 8:
                System.out.println( "eight");
                break;
            case 9:
                System.out.println( "nine");
                break;
            case 10:
                System.out.println( "ten");
                break;
            default:
                System.out.println("no of greater than 10");
        }
    }
}