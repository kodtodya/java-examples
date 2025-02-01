package com.kodtodya.practice.exception;

import com.kodtodya.practice.exception.customException.InvalidMarkException;

import java.util.Scanner;

public class StudentService {

    Scanner scanner = new Scanner(System.in);

    public void addMarks() throws InvalidMarkException {
        System.out.println("Pls enter marks or maths:");
        int mathsMarks = Integer.parseInt(scanner.nextLine());

        if (mathsMarks > 100 || mathsMarks < 0) {
            throw new InvalidMarkException(1000, "Marks for Maths are invalid.");
        }
    }
}
