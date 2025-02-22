package com.kodtodya.practice.functionalInterface.additionalExamples;

public class GreetingsExample {
    public static void main(String[] args) {
       Greetings greetings = () -> System.out.println("Hello world!!");

        greetings.sayHello();

        GreetingsWithParam greetingsWithParam = (name) -> System.out.println("Hello " + name + "!!");
        greetingsWithParam.sayHello("pune");
    }
}

interface Greetings {
    void sayHello();
}

interface GreetingsWithParam {
    void sayHello(String name);
}
