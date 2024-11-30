package com.kodtodya.practice.multithreading.lock;

// Java program to illustrate class level lock
public class ObjectLevelLockDemo implements Runnable {

    public void run() {
        Lock();
    }

    public void Lock() {
        System.out.println(Thread.currentThread().getName());
        synchronized (this) {
            System.out.println("in block " + Thread.currentThread().getName());
            System.out.println("in block " + Thread.currentThread().getName() + " end");
        }
    }

    public static void main(String[] args) {
        ObjectLevelLockDemo objectLock1 = new ObjectLevelLockDemo();
        Thread t1 = new Thread(objectLock1);
        Thread t2 = new Thread(objectLock1);
        ObjectLevelLockDemo objectLock2 = new ObjectLevelLockDemo();
        Thread t3 = new Thread(objectLock2);
        t1.setName("t1");
        t2.setName("t2");
        t3.setName("t3");
        t1.start();
        t2.start();
        t3.start();
    }
}
