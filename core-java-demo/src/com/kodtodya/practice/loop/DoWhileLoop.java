package com.kodtodya.practice.loop;

public class DoWhileLoop {

    //    Psuedo code:
    //        - write a method to print numbers till 10 starting from 1.
    //        - print the no using loop

    private void printNo(int no) {
        System.out.println(no);
    }

    public static void main(String[] args) {
        DoWhileLoop loopClass = new DoWhileLoop();
        int no = 0;

        do {
            loopClass.printNo(++no); // print the no using loop
        } while(no < 10);
    }
}
