package com.avadhut.operator.staticDemo;

public class StaticDemo {

    static int no;

    public static void main(String[] args) {
        StaticDemo staticDemo = new StaticDemo();
        staticDemo.no = 10;
        staticDemo.printNo();

        City.printCity();
    }

    public void printNo() {
        System.out.println("Currently no's value = " + no);
    }
}
