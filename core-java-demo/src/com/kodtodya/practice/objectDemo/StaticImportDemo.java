package com.kodtodya.practice.objectDemo;

import static com.kodtodya.practice.objectDemo.model.CityDetails.city;

public class StaticImportDemo {

    public static void main(String[] args) {
        city = "pune";

        System.out.println("city=" + city);

        StaticImportDemo staticImportDemo = new StaticImportDemo();

        staticImportDemo.printHello("avadhut");
    }

    public void printHello(String name) {
        System.out.println("hello " + name);
    }
}
