package com.kodtodya.practice.staticImport.service;

public class HelloService {

    public static void sayHello(String name) {
        System.out.println("Hello " + (name.isEmpty() ? "world!!!" : name + "!!!"));
    }

    public static void sayHello(String...names) {
        for(String name: names) {
            System.out.println("Hello " + name);
        }
    }
}
