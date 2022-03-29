package com.github.jsofosu;


public class CircularList {

    private  Node head = null;
    private   Node tail = null;


    public void addNode(int value) {
        Node newNode = new Node(value);

        if (head == null) {
            head = newNode;
        } else {
            tail.nextNode = newNode;
        }

        tail = newNode;
        tail.nextNode = head;
    }

    public Node getHead() {
        return head;
    }

}
