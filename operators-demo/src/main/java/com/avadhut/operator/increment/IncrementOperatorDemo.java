package com.avadhut.operator.increment;

import java.util.Scanner;

public class IncrementOperatorDemo {
    public static void main(String[] args) {
        // Pseudo code
        // increment operator - accept one number from user and print (no + 1)

        Scanner scanner = new Scanner(System.in);
        System.out.println("Pls enter a positive number: ");
        int no = Integer.parseInt(scanner.nextLine());

        System.out.println("Entered value: " + no);

        System.out.println("Incremental value: " + no++);
        System.out.println("Actual Incremental value: " + no);

        System.out.println("Next Incremental value: " + ++no);
    }
}
