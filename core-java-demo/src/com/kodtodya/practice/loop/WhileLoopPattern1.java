package com.kodtodya.practice.loop;

public class WhileLoopPattern1 {

    //    Psuedo code:
    //          *
    //          *	*
    //          *	*	*
    //          *	*	*	*
    //          *	*	*	*	*

    public static void main(String[] args) {
        int row = 1;

        while(row <= 5) {
            int column = 1;

            while(column <= row) {
                System.out.print("#\t");
                column++;
            }
            System.out.println();
            row++;
        }
    }
}
