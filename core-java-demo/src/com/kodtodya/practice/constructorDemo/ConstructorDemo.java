package com.kodtodya.practice.constructorDemo;

public class ConstructorDemo {
    public static void main(String[] args) {
        Train train1 = new Train();
        train1.setTrainId(1);
        train1.setTrainName("Shatabdi Express");

        Train train2 = new Train(2, "Rajdhani Express");
//        train2.setTrainId(2);
//        train2.setTrainName("Rajdhani Express");

        System.out.println("Train1: " + train1);
        System.out.println("Train2: " + train2);
    }
}
