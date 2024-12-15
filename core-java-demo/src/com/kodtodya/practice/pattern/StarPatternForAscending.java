package com.kodtodya.practice.pattern;

public class StarPatternForAscending {

    // Pseudo code
    // Print below pattern
    //*
    //**
    //***
    //****
    //*****
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) { // rowCount
            for (int innerCounter=0; innerCounter <= i; innerCounter++) {//columnCount
                System.out.print("*\t");
            }
            System.out.println("\n");
        }
    }
}
