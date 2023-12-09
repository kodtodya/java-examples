package com.kodtodya.practice.loop;

public class ForLoop {

    //    Psuedo code:
    //        - write a method to print numbers till 10 starting from 1.
    //        - print the no using loop

    private void printNo(int no) {
        System.out.println(no);
    }

    public static void main(String[] args) {
        ForLoop loopClass = new ForLoop();

        for (int no = 1; no <= 10; ++no) {
            loopClass.printNo(no); // print the no using loop
        }
    }
}
