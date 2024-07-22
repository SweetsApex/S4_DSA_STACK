package Stacks;

public class StackLinkedList {
    static class Node {
        int data;
        Node next;
    }

    private Node top;

    public StackLinkedList() {
        this.top = null;
        System.out.println("The stack is created using LinkedList");
        System.out.println();
    }

    // Check if it is empty
    public boolean isEmpty() {
        if (top == null) {
            System.out.println("Stack is empty");
            System.out.println();
            return true;
        } else {
            System.out.println("Stack is not empty");
            System.out.println();
            return false;
        }
    }

    // Implement push method
    public void push(int value) {
        Node newNode = new Node();
        newNode.data = value;
        newNode.next = top;
        top = newNode;
        System.out.println("The value is successfully inserted");
        System.out.println();
    }

    // Implement pop method
    public int pop() {
        if (isEmpty()) {
            System.out.println("The stack is empty");
            System.out.println();
            return -1; // Indicates stack is empty
        } else {
            int topValue = top.data;
            top = top.next;
            System.out.println("The value is successfully removed: " + topValue);
            System.out.println();
            return topValue;
        }
    }

    // Implement peek
    public int peek() {
        if (isEmpty()) {
            System.out.println("The stack is empty");
            System.out.println();
            return -1; // Indicates stack is empty
        } else {
            int topValue = top.data;
            System.out.println("The top value is: " + topValue);
            System.out.println();
            return topValue;
        }
    }

    // Implement delete a stack
    public void deleteStack() {
        top = null;
        System.out.println("The stack is successfully deleted");
        System.out.println();
    }
}
