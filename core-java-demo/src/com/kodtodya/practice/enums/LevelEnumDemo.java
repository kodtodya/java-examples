package com.kodtodya.practice.enums;

import java.util.Scanner;

public class LevelEnumDemo {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Pls enter temperature level:");
        String levelString = scanner.nextLine(); // low

        Level temparatureLevel = Level.fromValue(levelString);

//        if (temparatureLevel == Level.HIGH) {
//            throw new Error("High temperature can not be sustained..");
//        }

        switch (temparatureLevel) {
            case LOW -> System.out.println("Temperature level is low.");
            case MEDIUM -> System.out.println("Temperature level is medium.");
            case HIGH -> throw new Error("High temperature can not be sustained..");
        }

        System.out.println("Current level: " + temparatureLevel);

        User user = new User();
        user.id = 1;
        user.name = "abc";
        user.userType = UserType.CUSTOMER;

        System.out.println("user: " + user);

    }
}
