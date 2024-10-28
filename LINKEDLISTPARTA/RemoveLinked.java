package LINKEDLISTPARTA;

import java.util.LinkedList;

public class RemoveLinked {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        
        // Add elements to the LinkedList
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);
        linkedList.add(40);
        linkedList.add(50);
        
        System.out.println("Original LinkedList: " + linkedList);

        // Remove the first element
        linkedList.removeFirst();
        System.out.println("After removeFirst(): " + linkedList);

        // Remove the last element
        linkedList.removeLast();
        System.out.println("After removeLast(): " + linkedList);

        // Remove element at index 1
        linkedList.remove(1);
        System.out.println("After remove(1): " + linkedList);

        // Remove a specific element (e.g., 30)
        linkedList.remove(Integer.valueOf(30));
        System.out.println("After remove(Integer.valueOf(30)): " + linkedList);
    }
}
