package com.kodtodya.practice.pattern;

public class StarPatternWhileAscending {

    // Pseudo code
    // Print below pattern
    //*
    //**
    //***
    //****
    //*****
    public static void main(String[] args) {
        int i = 0;
        while (i < 5) { // rowCount
            int innerCounter=0;
            while (innerCounter <= i) {//columnCount
                System.out.print("*\t");
                innerCounter++;
            }
            System.out.println("\n");
            i++;
        }
    }
}
