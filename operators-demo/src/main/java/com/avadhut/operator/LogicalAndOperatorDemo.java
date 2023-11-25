package com.avadhut.operator;

import java.util.Scanner;

public class LogicalAndOperatorDemo {

//    Psuedo code:
//        if (no is greater than 0 AND less than 1000 or not)
//	        ? print - condition matching - all good
//	        : print - condition NOT matching - all NOT good

    public static void main(String[] args) {
        System.out.println("Please enter value:");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        if (Integer.valueOf(input) > 0 && Integer.valueOf(input) < 1000 ) {
            System.out.println("condition matching- all good");
        } else {
            System.out.println("condition NOT matching- all NOT good");
        }
    }
}
