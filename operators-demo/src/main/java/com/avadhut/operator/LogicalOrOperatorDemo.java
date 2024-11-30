package com.avadhut.operator;

import java.util.Scanner;

public class LogicalOrOperatorDemo {

//    Psuedo code:
//      if (no is divisible by 17 OR divisible by 2)
//	        ? print - condition matching - found the the macthing value
//	        : print - condition NOT matching - all NOT good

    public static void main(String[] args) {
        System.out.println("Please enter value:");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        if (Integer.valueOf(input) % 17 == 0 || Integer.valueOf(input) % 2 == 0 ) {
            System.out.println("condition matching - found the the matcthing value");
        } else {
            System.out.println("condition NOT matching- all NOT good");
        }
    }
}
