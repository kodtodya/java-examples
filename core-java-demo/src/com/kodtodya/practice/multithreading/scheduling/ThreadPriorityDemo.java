package com.kodtodya.practice.multithreading.scheduling;

// Concepts cleared in this demo: scheduling, priority

class SupermanThread extends Thread {
    int superCount = 1;

    public void run() {
        System.out.println("Thread SupermanThread started");
        while (superCount <= 3) {
            System.out.println("Value: " + superCount + " in Thread SupermanThread");
            superCount++;
        }
        System.out.println("Thread SupermanThread completed");
    }
}

class BatmanThread extends Thread {
    int batCount = 1;

    public void run() {
        System.out.println("Thread BatmanThread started");
        while (batCount <= 3) {
            System.out.println("Value: " + batCount + " in Thread BatmanThread");
            batCount++;
        }
        System.out.println("Thread BatmanThread completed");
    }
}

class IronmanThread extends Thread {
    int ironCount = 1;

    public void run() {
        System.out.println("Thread IronmanThread started");
        while (ironCount <= 3) {
            System.out.println("Value: " + ironCount + " in Thread IronmanThread");
            ironCount++;
        }
        System.out.println("Thread IronmanThread completed");
    }
}

public class ThreadPriorityDemo {
    public static void main(String[] args) {
        System.out.println(" ----------- Main thread starts here -------------");
        SupermanThread supermanThread = new SupermanThread();
        BatmanThread batmanThread = new BatmanThread();
        IronmanThread ironmanThread = new IronmanThread();

        Thread currentThread = Thread.currentThread();
        System.out.println("Thread Name: " + currentThread.getName());

        currentThread.setPriority(Thread.MAX_PRIORITY);
        batmanThread.setPriority(Thread.MIN_PRIORITY);
        ironmanThread.setPriority(Thread.NORM_PRIORITY);

        supermanThread.start();
        batmanThread.start();
        ironmanThread.start();
        System.out.println(" ----------- Main thread ends here -------------");
    }
}