package com.kodtodya.practice.service;

import com.kodtodya.practice.model.Person;

import java.util.Scanner;

public class GovtSchemeDemoApplication {

    public static void main(String[] args) {
        // new operator - provides new object
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pls enter first name:");
        String firstName = scanner.nextLine();

        System.out.println("Pls enter last name:");
        String lastName = scanner.nextLine();

        System.out.println("Pls enter age:");
        int age = Integer.parseInt(scanner.nextLine());

        Person person = new Person();
        person.firstName = firstName;
        person.lastName = lastName;
        person.age = age;

        System.out.println("Person details received in system: " + person);
    }
}
