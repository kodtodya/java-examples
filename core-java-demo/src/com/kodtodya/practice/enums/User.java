package com.kodtodya.practice.enums;

public class User {
    int id;
    String name;
    UserType userType;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", userType=" + userType +
                '}';
    }
}
