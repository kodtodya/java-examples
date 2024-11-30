package com.kodtodya.practice.exception;

import java.util.Scanner;

public class ExceptionWithThrowsDemo {
    public static void division() throws NumberFormatException {
        System.out.println("Please enter 2 values:");
        Scanner scanner = new Scanner(System.in);
        String firstInput = scanner.nextLine();
        String secondInput = scanner.nextLine();

        int no1 = Integer.valueOf(firstInput);
        int no2 = Integer.valueOf(secondInput);

        System.out.println("Division: " + no1/ no2);
    }

    public static void process() {
        try {
            division();
        } catch (NumberFormatException ex) {
            System.err.println(ex);
        }
    }

    public static void main(String[] args) {
        process();
    }
}
