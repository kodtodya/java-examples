package com.avadhut.operator;

import java.util.Scanner;

public class PrintNumbers {

    private static Scanner scanner = new Scanner(System.in);

    // e.g. Pls write a code to print numbers starting from 1 till 20

    public static void main(String[] args) {

        System.out.println("Pls enter the range: ");
        int range = scanner.nextInt();
        incrementOperatorPrints(range);
        decrementOperatorPrints(range);
    }

    // ** Pseudo code:
    //- create a variable and name it as no = 1
    //- loop no <= 21
    //	- print no
    //	- no = no + 1
    public static void incrementOperatorPrints(int range) {
        System.out.println("------------- Increment operator output ---------------");
        int no = 1;
        while (no <= range) {
            System.out.println(no);
            no++; //no = no + 1;
        }
        System.out.println("------------- Increment operator output ends here ---------------");
    }

    // ** Pseudo code:
    //- accept range
    //- loop range >= 1
    //	- print range
    //	- range = range - 1
    public static void decrementOperatorPrints(int range) {
        System.out.println("------------- Decrement operator output ---------------");
        while (range >= 1) {
            System.out.println(range);
            range--; //range = range - 1;
        }
        System.out.println("------------- Decrement operator output ends here ---------------");
    }
}
