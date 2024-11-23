package LINKEDLISTPARTB;

// import java.util.LinkedList;

public class MergeSort {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // LinkedList class
    public static class LinkedList {
        Node head;

        // Add node to the front of the list
        public void addFirst(int data) {
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
        }

        // Print the linked list
        public void print() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println("null");
        }

        private Node getMid(Node head) {
            Node slow = head;
            Node fast = head.next;

            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
            return slow; // mid node
        }

        private Node merge(Node head1, Node head2) {
            Node mergeLL = new Node(-1);
            Node temp = mergeLL;

            while (head1 != null && head2 != null) {
                if (head1.data <= head2.data) {
                    temp.next = head1;
                    head1 = head1.next;
                    temp = temp.next;
                } else {
                    temp.next = head2;
                    head2 = head2.next;
                    temp = temp.next;
                }
            }

            while (head1 != null) {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            }

            while (head2 != null) {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
            return mergeLL.next;
        }

        public Node mergesort(Node head) {
            if (head == null || head.next == null) {
                return head;
            }
            // find mid
            Node mid = getMid(head);

            // Left & Right Ms
            Node rightHead = mid.next;
            mid.next = null;
            Node newLeft = mergesort(head);
            Node newRight = mergesort(rightHead);

            // Merge
            return merge(newLeft, newRight);
        }
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);

        System.out.println("Original List:");
        ll.print();

        // Linkend list Sorted
        ll.head = ll.mergesort(ll.head);

        System.out.println("Sorted List:");
        ll.print();
    }
}

// java MergeSort.java