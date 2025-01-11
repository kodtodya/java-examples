package com.kodtodya.practice.staticImport;

import static com.kodtodya.practice.staticImport.service.HelloService.sayHello;

public class StaticImportDemo {
    public static void main(String[] args) {
        sayHello("avadhut");
        sayHello("avadhut", "pune");
    }
}
