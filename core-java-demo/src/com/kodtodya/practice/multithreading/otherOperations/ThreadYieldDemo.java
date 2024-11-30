package com.kodtodya.practice.multithreading.otherOperations;

public class ThreadYieldDemo extends Thread {
    public void run() {
        for (int i = 0; i < 3; i++)
            System.out.println(Thread.currentThread().getName() + " in control");
    }

    public static void main(String[] args) {
        ThreadYieldDemo t1 = new ThreadYieldDemo();
        ThreadYieldDemo t2 = new ThreadYieldDemo();
        // this will call run() method  
        t1.start();
        t2.start();
        for (int i = 0; i < 3; i++) {
            // Control passes to child thread  
            Thread.yield();
            System.out.println(Thread.currentThread().getName() + " in control");
        }
    }
}  