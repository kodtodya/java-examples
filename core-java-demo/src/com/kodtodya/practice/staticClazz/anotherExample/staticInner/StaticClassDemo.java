package com.kodtodya.practice.staticClazz.anotherExample.staticInner;

public class StaticClassDemo {
    public static void main(String[] args) {
        Outer.Inner inner = new Outer.Inner();
        inner.state = "MH";
        inner.country = "IN";
        inner.printData();
    }
}
