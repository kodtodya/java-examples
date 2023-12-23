package com.kodtodya.practice.accessModifiers.model;

public class Person {
    public String name;
    protected String city;

    private int heightInCm;
    private int weightInKg;

    int salary;
    public static final String NATIONALITY = "Indian";

    public Person(int heightInCm, int weightInKg, int salary) {
       this.heightInCm = heightInCm;
        this.weightInKg = weightInKg;
        this.salary = salary;
    }

    public Person() {
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", heightInCm=" + heightInCm +
                ", weightInKg=" + weightInKg +
                ", salary=" + salary +
                ", nationality=" + NATIONALITY +
                '}';
    }
}
