package com.kodtodya.practice.arrays;

public class MultiDimentionalArrayDemo {

    public static void main(String[] args) {
        int[][] marks = new int[3][3];

        marks[0][0] = 55;
        marks[0][1] = 67;
        marks[0][2] = 98;

        marks[1][0] = 56;
        marks[1][1] = 45;
        marks[1][2] = 87;

        marks[2][0] = 28;
        marks[2][1] = 96;
        marks[2][2] = 11;

        System.out.println("Size of array: " + marks.length);

        System.out.println("---------------------------------");
        System.out.println("Demo of for loop:");
        // for loop demo for array
        for (int row = 0; row < marks.length; row++) {
            for (int column = 0; column < marks.length; column++) {
                System.out.print(marks[row][column] + "\t");
            }
            System.out.println();
        }
    }
}
