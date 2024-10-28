package LINKEDLISTPARTA;

import java.util.LinkedList;

public class AddFirstLinked {
    public static class Node {
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;

    public void addFirst(int data){
          // Step1 = create new node
          Node newNode = new Node(data);

     // Jab Empty node hoga
        if (head==null) {
            head = tail = newNode;
            return;
        }

        // Step2 -- new Node  next  = head
        newNode.next = head;  // Link node

        // Step3 -- head ==  newNode
        head = newNode;
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        
        ll.addFirst(1);
        ll.addFirst(2);
    }
}
