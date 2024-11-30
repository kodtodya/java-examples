package com.kodtodya.practice.datastructure.stack;

import java.util.LinkedList;
import java.util.Queue;

public class StackBackedByQueueSingleList {

    private Queue<String> baseQueue = new LinkedList<String>();

    public void push(String item) {
        int size = baseQueue.size();
        //push new item to s1
        baseQueue.add(item);

        // till s1 is empty, push everything to s2
        for (int counter = 0 ; counter < size; counter ++) {
            baseQueue.add(baseQueue.remove());
        }

        System.out.println("String item inserted: " + item);
    }

    public void print() {
        System.out.println("Current Stack item: " + baseQueue);
    }
    public void pop() {
        if (!baseQueue.isEmpty())
            baseQueue.poll();
    }

    public static void main(String[] args) {
        StackBackedByQueueSingleList stack = new StackBackedByQueueSingleList();
        for (int i = 0; i <= 5; i++) {
            stack.push("no" + i);
            System.out.println("String is being inserted: no" + i);
        }

        System.out.println("------------------------------");
        for (int i = 0; i <= 5; i++) {
            stack.print();
            stack.pop();
        }
    }
}

