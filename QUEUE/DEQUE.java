package QUEUE;

import java.util.*;

public class DEQUE {
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>(); // Using Java's LinkedList as a Deque
        deque.addFirst(1); // Example of deque operation
        deque.addFirst(2);
        deque.addLast(3);  // Example of deque operation
        deque.addLast(4); 
        System.out.println(deque); // Output: [1, 2]

        // deque.removeFirst();
        // System.out.println(deque);
        
        deque.removeLast();
        System.out.println(deque);

        System.out.println("First element = " + deque.getFirst());
        System.out.println("Last element = " + deque.getLast());

    } 
}
