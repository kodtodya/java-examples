package com.kodtodya.practice.loop;

public class WhileLoopPattern2 {

    //    Psuedo code:
    //          				#
    //          			#	#
    //			       #    #	#
    //             #	#	#	#
    //          #	#	#	#	#

    public static void main(String[] args) {
        int row = 1;

        while(row <= 5) {
            int column = row;

            // logic for blank spaces and tabs
            while(column < 5) {
                System.out.print("\t");
                column++;
            }

            // logic for characters(#)
            int character = 1;
            while(character <= row) {
                System.out.print("#\t");
                character++;
            }
            System.out.println();
            row++;
        }
    }
}
