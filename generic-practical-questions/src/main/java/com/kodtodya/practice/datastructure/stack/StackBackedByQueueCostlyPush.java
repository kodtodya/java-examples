package com.kodtodya.practice.datastructure.stack;

import java.util.LinkedList;
import java.util.Queue;

public class StackBackedByQueueCostlyPush {

    private Queue<String> baseQueue = new LinkedList<String>();
    private Queue<String> tempQueue = new LinkedList<String>();

    public void push(String item) {
        //push new item to s1
        tempQueue.add(item);

        // till s1 is empty, push everything to s2
        while (!baseQueue.isEmpty()) {
            tempQueue.add(baseQueue.poll());
        }
        //exchange the data
        Queue<String> exchangeQ = baseQueue;
        baseQueue = tempQueue;
        tempQueue = exchangeQ;
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
        StackBackedByQueueCostlyPush stack = new StackBackedByQueueCostlyPush();
        for (int i = 0; i <= 5; i++) {
            stack.push("no" + i);
            System.out.println("String is being inserted: no" + i);
        }

        System.out.println("----------------------");
        for (int i = 0; i <= 5; i++) {
            stack.print();
            stack.pop();
        }
    }
}

