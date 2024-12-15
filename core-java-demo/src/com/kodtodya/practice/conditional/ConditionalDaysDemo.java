package com.kodtodya.practice.conditional;

import java.util.Scanner;

public class ConditionalDaysDemo {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("pls enter the day of the week in int:");
        int dayOfWeek = Integer.parseInt(scanner.nextLine());

        if (dayOfWeek == 1) {
            System.out.println("Sunday");
        } else if (dayOfWeek == 2) {
            System.out.println("Monday");
        } else if (dayOfWeek == 3) {
            System.out.println("Tuesday");
        } if (dayOfWeek == 4) {
            System.out.println("Wednesday");
        } else if (dayOfWeek == 5) {
            System.out.println("Thursday");
        } else if (dayOfWeek == 6) {
            System.out.println("Friday");
        } else if (dayOfWeek == 7) {
            System.out.println("Saturday");
        }

        System.out.println("output from switch: ");
        // optimized switch
        switch (dayOfWeek) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
        }
    }
}
