package com.kodtodya.practice.oops.inheritance.model;

public class Person {
    private String name;
    private Address address;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
