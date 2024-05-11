package com.avadhut.operator;

import java.util.Scanner;

public class ArrayDemo {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Pls enter marks of 5 subject: ");

        int[] subjectMarks = new int[5]; //int subjectMarks[] = new int[5];
        int position = 0;
        while (position <= 4) {
            System.out.println("Please enter marks for subject-" + position + ": ");
            subjectMarks[position] = scanner.nextInt();
            position++;
        }

        System.out.println("marks for student are: ");
        position = 0;

        do {
            System.out.println("marks for subject-" + position + "= " + subjectMarks[position]);
            position++;
        } while (position <= 4);

//        while (position <= 4) {
//            System.out.println("marks for subject-" + position + "= " + subjectMarks[position]);
//            position++;
//        }
    }
}
