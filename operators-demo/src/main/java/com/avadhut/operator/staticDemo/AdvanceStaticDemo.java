package com.avadhut.operator.staticDemo;

import java.util.Scanner;

public class AdvanceStaticDemo {

    static int staticNo;
    int nonStaticNo;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("pls enter the value:");
        staticNo = Integer.parseInt(scanner.nextLine());

        AdvanceStaticDemo object1 = new AdvanceStaticDemo();
        object1.nonStaticNo = Integer.parseInt(scanner.nextLine());
        object1.printNo();

        AdvanceStaticDemo object2 = new AdvanceStaticDemo();
        object2.printNo();

        object1.staticNo = 25;
        object1.printNo();
        object2.printNo();
    }

    public void printNo() {
        System.out.println("staticNo=" + staticNo + "and nonStaticNo=" + nonStaticNo);
    }
}
