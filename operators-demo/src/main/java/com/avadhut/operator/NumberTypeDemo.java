package com.avadhut.operator;

import java.util.Scanner;

public class NumberTypeDemo {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Psuedo code:
        //1. Display a msg to user to enter a positive value
        //2. accept the value from user (scanner class usage)
        //3.
        //if (no % 2 == 0) {
        //	if  (no is greater than 100) -> golden no
        //	else if (no is smaller than 100) -> silver no
        //} else {
        //	if no is greater than 100 -> plantinum no
        //	if no is smaller than 100 -> titanium no
        //}

        System.out.println("Pls enter positive no: ");
        int no = scanner.nextInt();

        // old fashion code
        if (no % 2 == 0) {
            if (no > 100) {
                System.out.println("this number is golden no.");
            } else {
                System.out.println("this number is silver no.");
            }
        } else {
            if (no > 100) {
                System.out.println("this number is platinum no.");
            } else {
                System.out.println("this number is titanium no.");
            }
        }

        // latest fashion code
        if ((no % 2 == 0) && (no > 100)) {
            System.out.println(" ----- this number is golden no. ----- ");
        }

        // next condition:
        if ((no % 2 == 0) && (no <= 100)) {
            System.out.println(" ----- this number is silver no. ----- ");
        }

        // next condition:
        if ((no % 2 != 0) && (no > 100)) {
            System.out.println(" ----- this number is platinum no. ----- ");
        }

        // next condition:
        if ((no % 2 != 0) && (no <= 100)) {
            System.out.println(" ----- this number is titanium no. ----- ");
        }


        //no > 100 OR no == even -> great no
        //no < 100 OR no == ODD -> super no


        if ((no > 100) || (no % 2 == 0)) {
            System.out.println("great no");
        }

        if ((no < 100) || (no % 2 != 0)) {
            System.out.println("super no");
        }

    }
}
