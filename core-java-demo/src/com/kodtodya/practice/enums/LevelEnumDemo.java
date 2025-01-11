package com.kodtodya.practice.enums;

public class LevelEnumDemo {
    public static void main(String[] args) {
        Level temparatureLevel = Level.HIGH;

        System.out.println("Current level: " + temparatureLevel);

        User user = new User();
        user.id = 1;
        user.name = "abc";
        user.userType = UserType.CUSTOMER;

        System.out.println("user: " + user);

    }
}
