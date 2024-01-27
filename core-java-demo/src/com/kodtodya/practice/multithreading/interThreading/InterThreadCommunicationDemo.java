package com.kodtodya.practice.multithreading.interThreading;

public class InterThreadCommunicationDemo {
    public static void main(String[] args) {
        final CustomerAccount customerAccount = new CustomerAccount();
        new Thread() {
            public void run() {
                customerAccount.withdraw(15000);
            }
        }.start();
        new Thread() {
            public void run() {
                customerAccount.deposit(10000);
            }
        }.start();
    }
}