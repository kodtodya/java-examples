package com.kodtodya.practice.finalDemo;

public class FinalDemo {

    public final String GREETING_MSG = "Hello Pune..";
    public final int DEFAULT_LOAD = 10;
    public final double DEFAULT_TEMPARATURE = 52.3;
    public final char DEFAULT_CHAR = 'a';
    public final boolean DEFAULT_FLAG = false;
    public static final String GREETING_MSG_TO_WORLD = "Hello World..";

    public static void main(String[] args) {
        FinalDemo finalDemo = new FinalDemo();
        System.out.println("msg: " + finalDemo.GREETING_MSG);
        System.out.println("msg: " + GREETING_MSG_TO_WORLD);
    }
}
