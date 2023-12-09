package com.kodtodya.practice.arrays;

public class ArrayDemo {

    public static void main(String[] args) {
        int marks[] =  new int[5];
        marks[0] = 45;
        marks[1] = 57;
        marks[2] = 98;
        marks[3] = 38;
        marks[4] = 76;

        System.out.println("Size of array: " + marks.length);

        // while loop demo for array
        int position = 0;
        System.out.println("Demo of while loop:");
        while(position < marks.length) {
            System.out.println(marks[position]);
            position++;
        }

        System.out.println("---------------------------------");
        System.out.println("Demo of for loop:");
        // for loop demo for array
        for(int index = 0; index < marks.length; index++) {
            System.out.println(marks[index]);
        }

        System.out.println("---------------------------------");
        System.out.println("Demo of for-each loop:");
        // for loop demo for array
        for(int element : marks) {
            System.out.println(element);
        }
    }
}
