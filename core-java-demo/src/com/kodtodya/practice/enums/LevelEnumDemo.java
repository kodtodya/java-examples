package com.kodtodya.practice.enums;

import java.util.Scanner;

public class LevelEnumDemo {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Pls enter temperature level:");
        String levelString = scanner.nextLine(); // low

        Level temparatureLevel = Level.valueOf(levelString);

        System.out.println("Current level: " + temparatureLevel);

        User user = new User();
        user.id = 1;
        user.name = "abc";
        user.userType = UserType.CUSTOMER;

        System.out.println("user: " + user);

    }
}
