package com.kodtodya.practice.logicDevelopment;

import java.util.Scanner;

public class ReverseNumberDemo {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Please enter number:");
        Scanner scanner = new Scanner(System.in);
        int no = Integer.valueOf(scanner.nextLine());

        //---------------------------------
//        int reverseNo = 0;
//        while (no > 0) {
//            int remainder = no % 10;
//            no = no / 10;
//            reverseNo = (reverseNo == 0) ? remainder : (reverseNo * 10) + remainder;
//            System.out.println("reverse no : "+ reverseNo);
//        }
        //---------------------------------

        int reverseNumber = 0;
        for (int anotherNo = no; anotherNo > 0; anotherNo = anotherNo / 10) {
            int remainder = anotherNo % 10;
            reverseNumber = (reverseNumber == 0) ? remainder : (reverseNumber * 10) + remainder;
            System.out.println("reverse no : "+ reverseNumber);
        }

        System.out.println(reverseNumber);
    }
}
