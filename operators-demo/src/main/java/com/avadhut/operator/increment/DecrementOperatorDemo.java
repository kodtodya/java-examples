package com.avadhut.operator.increment;

import java.util.Scanner;

public class DecrementOperatorDemo {
    public static void main(String[] args) {
        // Pseudo code
        // decrement operator - accept one number from user and print (no - 1)

        Scanner scanner = new Scanner(System.in);
        System.out.println("Pls enter a positive number: ");
        int no = Integer.parseInt(scanner.nextLine());

        System.out.println("Entered value: " + no);

        System.out.println("Decremental value: " + no--);
        System.out.println("Actual Decremental value: " + no);

        System.out.println("Next Decremental value: " + --no);
    }
}
