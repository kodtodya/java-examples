package com.kodtodya.practice.enums;

public class EnumDemo {

    public static void main(String[] args) {

        Address address = new Address();
        address.city = "pune";
        address.pincode = 411001;
        address.direction = Direction.WEST;

        System.out.println("address: " + address);
    }
}
