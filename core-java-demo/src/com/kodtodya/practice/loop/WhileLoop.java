package com.kodtodya.practice.loop;

public class WhileLoop {

    //    Psuedo code:
    //        - write a method to print a no = 10.
    //        - print the no using loop

    private void printNo(int no) {
        System.out.println(no);
    }

    public static void main(String[] args) {
        WhileLoop loopClass = new WhileLoop();
        int no = 0;

        while(no < 10) {
            loopClass.printNo(++no); // print the no using loop
        }
    }
}
