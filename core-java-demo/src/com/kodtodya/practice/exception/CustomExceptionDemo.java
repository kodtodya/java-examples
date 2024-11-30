package com.kodtodya.practice.exception;

import java.util.Scanner;

public class CustomExceptionDemo {
    public static void acceptPersonalDetails() throws NameNotProvidedException, CityNotProvidedException {
        System.out.println("----------------------------------------------------");
        System.out.println("Please enter name for person:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Please enter city for person:");
        String city = scanner.nextLine();

        if (name.isEmpty()) {
            throw new NameNotProvidedException("Provided name is null or invalid.");
        }

        if (city.isEmpty()) {
            throw new CityNotProvidedException("Provided city is null or invalid.");
        }
        System.out.println("Personal details are: " + name + "," + city);
    }

    public static void main(String[] args) {
        while (true) {
            try {
                acceptPersonalDetails();
            } catch (NameNotProvidedException | CityNotProvidedException ex) {
                System.err.println(ex.getMessage());
            } finally {
                System.out.println("Pls enter data carefully.");
            }
        }
    }
}
