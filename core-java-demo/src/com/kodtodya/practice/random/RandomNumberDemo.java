package com.kodtodya.practice.random;

import java.util.Random;
import java.util.Scanner;
import java.util.function.Predicate;

public class RandomNumberDemo {
    private static final Scanner scanner = new Scanner(System.in);
    private static final Random random = new Random();


    public static void main(String[] args) {
//        System.out.println("Pls enter id:");
//        int id = Integer.parseInt(scanner.nextLine());
        int id = randomValue();

        System.out.println("received id: " + id);
    }

    private static int randomValue() {
        int id = random.nextInt(1000, 9999);
        //double id = random.nextDouble(1000);
        return (id < 0) ? id * (-1) : id;
    }
}
