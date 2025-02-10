package com.kodtodya.practice.exception;

import com.kodtodya.practice.exception.customException.InvalidBookIdException;

import java.util.Scanner;

public class BookExceptionDemo {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws InvalidBookIdException {
        System.out.println("Pls enter book id: ");
        int bookId = 0;
        try {
            bookId = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException nfe) {
            throw new InvalidBookIdException("Please enter valid book id in integer.");
        }

        System.out.println("Provided book id is: " + bookId);
    }
}
