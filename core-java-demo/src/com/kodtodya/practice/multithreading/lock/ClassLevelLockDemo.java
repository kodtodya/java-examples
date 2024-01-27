package com.kodtodya.practice.multithreading.lock;

// Java program to illustrate class level lock
public class ClassLevelLockDemo implements Runnable {

    public void run() {
        Lock();
    }

    public void Lock() {
        System.out.println(Thread.currentThread().getName());
        synchronized (ClassLevelLockDemo.class) {
            System.out.println("in block " + Thread.currentThread().getName());
            System.out.println("in block " + Thread.currentThread().getName() + " end");
        }
    }

    public static void main(String[] args) {
        ClassLevelLockDemo classLock1 = new ClassLevelLockDemo();
        Thread t1 = new Thread(classLock1);
        Thread t2 = new Thread(classLock1);
        ClassLevelLockDemo classLock2 = new ClassLevelLockDemo();
        Thread t3 = new Thread(classLock2);
        t1.setName("t1");
        t2.setName("t2");
        t3.setName("t3");
        t1.start();
        t2.start();
        t3.start();
    }
}
