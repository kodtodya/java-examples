package com.kodtodya.practice.collection;

public class LinkedListDemo {

    Node head;
    private class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }


    // To insert a node at the beginning of Linked List.
    public void push(Integer data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // To insert a node at the end of the Linked List.
    public void insertAtLast(Integer data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node tempNode = head;
        while(tempNode.next != null) {
            tempNode = tempNode.next;
        }

        tempNode.next = newNode;
    }

    public int getCount() {
        int count = 0;
        Node tempNode = head;
        while (tempNode.next != null) {
            ++count;
            tempNode = tempNode.next;
        }
        return count;
    }

    public Node findMiddleNode() {
        int count = this.getCount();
        Node tempNode = head;
        // If the number of nodes are even, then there are
        // two middle nodes print the first middle node
        int position = (count % 2 == 0) ? (count/2) - 1 : (count/2);

        while (position != 0) {
            --position;
            tempNode = tempNode.next;
        }
        System.out.println(tempNode.data);

        return tempNode;
    }

    public void print() {
        Node tempNode = head;
        while (tempNode.next != null) {
            System.out.print(tempNode.data + "\t");
            tempNode = tempNode.next;
        }
    }

    public static void main(String[] args) {

        LinkedListDemo demo = new LinkedListDemo();
        // Making a linked list of odd number of nodes
        // 1->2->3->4->5->NULL
        demo.push(1);
        demo.insertAtLast(2);
        demo.insertAtLast(3);
        demo.insertAtLast(4);
        demo.insertAtLast(5);
        System.out.print("Original Linked List:");
        demo.print();
        System.out.println("\nThe middle node of a Linked list is: " + demo.findMiddleNode().data);
        System.out.println("-------------------------------------------------------");


        // Making a linked list of even number of nodes
        // 10->20->30->40->50->60->NUdemo
        demo = new LinkedListDemo();
        demo.push(10);
        demo.insertAtLast(20);
        demo.insertAtLast(30);
        demo.insertAtLast(40);
        demo.insertAtLast(50);
        demo.insertAtLast(60);
        System.out.print("Original Linked List:");
        demo.print();
        System.out.println("\nThe middle node of a Linked list is: " + demo.findMiddleNode().data);

    }
}
