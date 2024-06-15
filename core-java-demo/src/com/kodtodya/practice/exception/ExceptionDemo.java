package com.kodtodya.practice.exception;

import java.util.Arrays;

public class ExceptionDemo {
    public static void main(String[] args) {
        processMarksUsingTryCatch();

        try {
            processMarksUsingThrows();
        } catch (Exception exception) {
            System.err.println(exception.getMessage());
        }
    }

    private static void processMarksUsingTryCatch() {
        int[] marks = new int[5];

        System.out.println("------ Before marks data assignment --------");
        marks[0] = 95;
        System.out.println("------ marks[0] data assignment completed --------");
        marks[1] = 67;
        System.out.println("------ marks[1] data assignment completed --------");
        marks[2] = 89;
        System.out.println("------ marks[2] data assignment completed --------");
        marks[3] = 72;
        System.out.println("------ marks[3] data assignment completed --------");
        marks[4] = 88;
        System.out.println("------ marks[4] data assignment completed --------");
        try {
            marks[5] = 95;
            System.out.println("------ marks[5] data assignment completed --------");
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.err.println("You are doing something wrong." +
                    "We have only 5 subject and you mut not insert marks for 6th subject " +
                    "and technical reason is: " + exception.getMessage());
        } catch (Exception exception) {
            System.err.println("Generic Exception " +
                    "and technical reason is: " + exception.getMessage());
        }

        System.out.println("marks of the student x: " + Arrays.toString(marks));
    }

    private static void processMarksUsingThrows() throws Exception {
        int[] marks = new int[5];

        System.out.println("------ Before marks data assignment --------");
        marks[0] = 95;
        System.out.println("------ marks[0] data assignment completed --------");
        marks[1] = 67;
        System.out.println("------ marks[1] data assignment completed --------");
        marks[2] = 89;
        System.out.println("------ marks[2] data assignment completed --------");
        marks[3] = 72;
        System.out.println("------ marks[3] data assignment completed --------");
        marks[4] = 88;
        System.out.println("------ marks[4] data assignment completed --------");
        try {
            marks[5] = 95;
            System.out.println("------ marks[5] data assignment completed --------");
        } catch (ArrayIndexOutOfBoundsException exception) {
            throw new Exception("Why you are inserting marks of 6th subject??");
        }

        System.out.println("marks of the student x: " + Arrays.toString(marks));
    }
}
