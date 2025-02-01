package com.kodtodya.practice.loop;

public class SequenceDemo {

    public static void main(String[] args) {

        // pseudo code
        // initialize no = 0
        // increment no
        // write a statement to print no
        // add above code to loop

        int no = 0;

        System.out.println("output using while loop:");
        // check condition
        while (no <= 10) {
            // code snippet
            System.out.println("no = "+ no);
            no++;
        }

        no = 0;
        System.out.println("output using do..while loop:");
        //do_while
        do {
            // code snippet
            System.out.println("no = "+ no);
            no++;
        } while (no <= 10); // check condition
    }
}
