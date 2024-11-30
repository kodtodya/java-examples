package com.kodtodya.practice.datastructure.queue;

import java.util.Stack;

public class QueueBackedByStackCostlyDeQueue {

    private final Stack<String> baseStack = new Stack<>();
    private final Stack<String> tempStack = new Stack<>();

    public void enQueue(String item) {
        //push new item to s1
        baseStack.push(item);
    }

    public String deQueue() {
        // till s1 is empty, push everything to s2
        while (!baseStack.isEmpty()) {
            tempStack.push(baseStack.pop());
        }
        return tempStack.isEmpty() ? "" : tempStack.pop();
    }

    public static void main(String[] args) {
        QueueBackedByStackCostlyDeQueue queue = new QueueBackedByStackCostlyDeQueue();

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
