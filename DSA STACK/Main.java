package Stacks;

public class Main {
    public static void main(String[] args) {
        // Testing StackArrays
        StackArrays stackArrays = new StackArrays(5);
        System.out.println();

        stackArrays.push(1);


        stackArrays.push(2);


        stackArrays.push(3);


        stackArrays.push(4);


        stackArrays.push(5);


        stackArrays.isEmpty();


        stackArrays.isFull();


        System.out.println("Top element is: " + stackArrays.peek());
        System.out.println("Popped element is: " + stackArrays.pop());
        System.out.println("Top element after pop is: " + stackArrays.peek());
        stackArrays.deleteStack();

        // Check palindrome
        String word = "civic";
        System.out.println("Is the word " + word + " a palindrome? " + StackArrays.isPalindrome(word));
        System.out.println();

        // Check palindrome
        String word2 = "math";
        System.out.println("Is the word " + word2 + " a palindrome? " + StackArrays.isPalindrome(word2));
        System.out.println();

        // Testing StackLinkedList
        StackLinkedList stackLinkedList = new StackLinkedList();
        System.out.println();

        stackLinkedList.push(10);

        stackLinkedList.push(20);

        stackLinkedList.push(30);

        stackLinkedList.push(40);

        stackLinkedList.push(50);

        stackLinkedList.isEmpty();

        System.out.println("Top element in LinkedList stack is: " + stackLinkedList.peek());
        System.out.println("Popped element from LinkedList stack is: " + stackLinkedList.pop());
        System.out.println("Top element after pop in LinkedList stack is: " + stackLinkedList.peek());

        stackLinkedList.deleteStack();
        System.out.println();
    }
}
