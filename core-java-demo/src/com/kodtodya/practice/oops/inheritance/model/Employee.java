package com.kodtodya.practice.oops.inheritance.model;

public class Employee extends Person {
    public int employeeId;
    public String dept;
    public int salary;

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", dept='" + dept + '\'' +
                ", salary=" + salary +
                ", name='" + getName() + '\'' +
                ", city='" + getAddress().city + '\'' +
                '}';
    }
}
