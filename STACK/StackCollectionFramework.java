package STACK;

import java.util.Stack;
public class StackCollectionFramework {
    public static void main(String[] args) {
        // Create a stack of integers
        Stack<Integer> s = new Stack<>(); 

        // Push elements into the stack
        s.push(10);
        s.push(20);
        s.push(30);

        // Pop elements and print the top element of the stack
        while (!s.isEmpty()) {
            // Print the top element of the stack
            System.out.println(s.peek()); 
            // Remove the top element from the stack
            s.pop(); 
        }
    }
}