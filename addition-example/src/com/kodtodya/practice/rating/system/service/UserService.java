package com.kodtodya.practice.rating.system.service;

import com.kodtodya.practice.rating.system.model.User;

import java.util.Scanner;

public class UserService {

    public User acceptUserData() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Pls enter user id:");
        //int id = scanner.nextInt();
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Pls enter user first name:");
        String firstName = scanner.nextLine();
        System.out.println("Pls enter user last name:");
        String lastName = scanner.nextLine();

        // initialize entity
        User user = new User();
        user.id = id;
        user.firstName = firstName;
        user.lastName = lastName;
        return user;
    }
}
