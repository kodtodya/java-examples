package com.avadhut.operator.arithmatic;

import java.util.Scanner;

public class ArithmaticOperatorDemo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Pls enter a positive number:");

        int no = scanner.nextInt();

        System.out.println("Pls enter another positive number:");

        int no2 = scanner.nextInt();

        if (no != no2) {
            System.out.println("value of 'a' is NOT exact equals to value of 'b'");
        } else {
            System.out.println("value of 'a' is exact equals to value of 'b'");
        }
    }
}
