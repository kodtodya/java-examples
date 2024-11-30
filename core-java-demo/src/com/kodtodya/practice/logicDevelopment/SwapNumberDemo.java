package com.kodtodya.practice.logicDevelopment;

public class SwapNumberDemo extends Object {
    public static void swapWithTemp(int no1, int no2) {
        System.out.println("Before swapping: no1:" + no1 + " & no2: " + no2);

        int temp = no1;
        no1 = no2;
        no2 = temp;

        System.out.println("After swapping: no1:" + no1 + " & no2: " + no2);
    }

    public static void swapWithoutTemp(int no1, int no2) {
        System.out.println("Before swapping: no1:" + no1 + " & no2: " + no2);
        // logic for swap without temp variable
        no1 = no1 + no2;
        no2 = no1 - no2;
        no1 = no1 - no2;

        System.out.println("After swapping: no1:" + no1 + " & no2: " + no2);
    }


    public static void main(String[] args) {
        int no1 = 53535, no2 = 314242; // output : no1:5 & no2: 10
        System.out.println("With temporary variable:");
        swapWithTemp(no1, no2);
        System.out.println("======================================");
        System.out.println("Without temporary variable:");
        swapWithoutTemp(no1, no2);
    }
}
