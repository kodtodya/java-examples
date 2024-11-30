package com.kodtodya.practice.multithreading.interThreading;

public class CustomerAccount {
    int balance = 10000;

    synchronized void withdraw(int amount) {
        System.out.println("going to withdraw...");

        if (this.balance < amount) {
            System.out.println("Less balance; waiting for deposit...");
            try {
                wait();
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }
        this.balance -= amount;
        System.out.println("withdraw completed...");
    }

    synchronized void deposit(int amount) {
        System.out.println("going to deposit...");
        this.balance += amount;
        System.out.println("deposit completed... ");
        notify();
    }
}