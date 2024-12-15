package com.kodtodya.practice.pattern;

public class StarPatternDoWhileAscending {

    // Pseudo code
    // Print below pattern
    //*
    //**
    //***
    //****
    //*****
    public static void main(String[] args) {
        int i = 0;
        do { // rowCount
            int innerCounter=0;
            do {//columnCount
                System.out.print("*\t");
                innerCounter++;
            } while (innerCounter <= i);
            System.out.println("\n");
            i++;
        } while (i < 5);
    }
}
