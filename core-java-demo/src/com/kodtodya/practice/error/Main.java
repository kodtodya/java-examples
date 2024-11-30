package com.kodtodya.practice.error;

class StackExample {
    public static void check(int i) {
        if (i == 0) {
        }
        else {
            check(i++);
        }
    }
}

public class Main {

    public static void main(String[] args) {
        StackExample.check(5);
    }
}  