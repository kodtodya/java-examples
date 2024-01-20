package com.kodtodya.practice.files.serialization;

import java.io.Serializable;

public class Student implements Serializable {
    private int rollNo;
    private String name;
    private String address;

    public Student(int rollNo, String name, String address) {
        this.rollNo = rollNo;
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student: {" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}