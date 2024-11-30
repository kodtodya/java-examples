package com.avadhut.operator.stringConcat;

import java.util.Scanner;

public class StringConcatenationDemo {
    // concat = connect two strings
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pls enter first string");
        String firstString = scanner.nextLine();
        System.out.println("Pls enter second string");
        String secondString = scanner.nextLine();

        System.out.println("output: " + (firstString + secondString));
    }
}
