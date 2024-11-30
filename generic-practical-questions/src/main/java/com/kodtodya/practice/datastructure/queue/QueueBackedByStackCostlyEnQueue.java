package com.kodtodya.practice.datastructure.queue;

import java.util.Stack;


public class QueueBackedByStackCostlyEnQueue {

    private final Stack<String> baseStack = new Stack<>();
    private final Stack<String> tempStack = new Stack<>();

    public void enQueue(String item) {
        // till s1 is empty, push everything to s2
        while (!baseStack.isEmpty()) {
            tempStack.push(baseStack.pop());
        }
        //push new item to s1
        baseStack.push(item);

        // push all items back to s1
        while (!tempStack.isEmpty()) {
            baseStack.push(tempStack.pop());
        }
    }

    public String deQueue() {
        return baseStack.isEmpty() ? "" : baseStack.pop();
    }

    public static void main(String[] args) {
        QueueBackedByStackCostlyEnQueue queue = new QueueBackedByStackCostlyEnQueue();
        for (int i = 0; i <= 5; i++) {
            queue.enQueue("no" + i);
            System.out.println("String is being inserted: no" + i);
        }

        System.out.println("----------------------");
        for (int i = 0; i <= 5; i++) {
            System.out.println(queue.deQueue());
        }
    }
}
