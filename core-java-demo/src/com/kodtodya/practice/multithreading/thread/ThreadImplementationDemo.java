package com.kodtodya.practice.multithreading.thread;

// Main Class
public class ThreadImplementationDemo {
    public static void main(String[] args) {
        System.out.println("Demonstration of threads by extending Thread starts here: ");
        int noOfThreads = 10; // Number of threads
        for (int i = 0; i < noOfThreads; i++) {
			MyThread thread = new MyThread();
			thread.start();
        }
    }
}
