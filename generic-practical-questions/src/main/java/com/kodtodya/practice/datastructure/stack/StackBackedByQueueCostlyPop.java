package com.kodtodya.practice.datastructure.stack;

import java.util.LinkedList;
import java.util.Queue;

public class StackBackedByQueueCostlyPop {

    private Queue<String> baseQueue = new LinkedList<String>();
    private Queue<String> tempQueue = new LinkedList<String>();

    public void push(String item) {
        baseQueue.add(item);
        System.out.println("Item inserted: " + baseQueue);
    }

    public void print() {
        System.out.println("Current Stack: " + baseQueue);
    }

    public void pop() {
        if (baseQueue.isEmpty())
            return;

        // till s1 is empty, push everything to s2
        while (baseQueue.size() != 1) {
            tempQueue.add(baseQueue.peek());
            baseQueue.remove();
        }
        System.out.println("Removed Item: " + baseQueue.peek());
        baseQueue.remove();

        //exchange the data
        Queue<String> exchangeQ = tempQueue;
        tempQueue = baseQueue;
        baseQueue = exchangeQ;
    }

    public static void main(String[] args) {
        StackBackedByQueueCostlyPop stack = new StackBackedByQueueCostlyPop();
        for (int i = 0; i < 5; i++) {
            stack.push("no" + i);
            System.out.println("String is being inserted: no" + i);
        }

        System.out.println("----------------------");
        for (int i = 0; i < 5; i++) {
            stack.print();
            stack.pop();
        }
    }
}

