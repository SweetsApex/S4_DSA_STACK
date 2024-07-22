package Stacks;

public class StackArrays {
    int[] arr;
    int topOfStack;

    public StackArrays(int size) {
        this.arr = new int[size];
        this.topOfStack = -1;
        System.out.println("The stack is created with a size of: " + size);
        System.out.println();
    }

    // Check if it is empty
    public boolean isEmpty() {
        if (topOfStack == -1) {
            System.out.println("Stack is empty");
            System.out.println();
            return true;
        } else {
            System.out.println("Stack is not empty");
            System.out.println();
            return false;
        }
    }

    // Check if stack is Full
    public boolean isFull() {
        if (topOfStack == arr.length - 1) {
            System.out.println("Stack is full");
            System.out.println();
            return true;
        } else {
            System.out.println("Stack is not full");
            System.out.println();
            return false;
        }
    }

    // Implement a push method
    public void push(int value) {
        if (isFull()) {
            System.out.println("The stack is full");
            System.out.println();
        } else {
            arr[topOfStack + 1] = value;
            topOfStack++;
            System.out.println("The value is successfully inserted");
            System.out.println();
        }
    }

    // Implement pop method
    public int pop() {
        if (isEmpty()) {
            System.out.println("The stack is empty");
            System.out.println();
            return -1; // Indicates stack is empty
        } else {
            int topValue = arr[topOfStack];
            topOfStack--;
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
            int topValue = arr[topOfStack];
            System.out.println("The top value is: " + topValue);
            System.out.println();
            return topValue;
        }
    }

    // Implement delete a stack
    public void deleteStack() {
        arr = null;
        topOfStack = -1;
        System.out.println("The stack is successfully deleted");
        System.out.println();
    }

    // Use the stack data structure to check whether a word is a palindrome or not
    public static boolean isPalindrome(String word) {
        int n = word.length();
        StackArrays stack = new StackArrays(n);

        // Push all characters of the word into the stack
        for (int i = 0; i < n; i++) {
            stack.push(word.charAt(i));
        }

        // Pop all characters from the stack and build the reversed word
        String reversedWord = "";
        while (!stack.isEmpty()) {
            reversedWord += (char) stack.pop();
        }

        // Check if the original word is equal to the reversed word
        return word.equals(reversedWord);
    }
}
