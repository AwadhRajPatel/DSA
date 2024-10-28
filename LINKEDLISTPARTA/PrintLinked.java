package LINKEDLISTPARTA;

public class PrintLinked {
    public static class Node {
        int data;
        Node next;

        public Node(int data) { 
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    // Method to print the LinkedList
    public void Print() {
        if (head == null) {
            System.out.println("LL is Empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Method to add a node at the beginning
    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    // Method to add a node at the end
    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    // addMiddleLinkedlist Method
    public void addMiddleLinkedlist(int idx, int data){
        if (idx ==0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i =0;

        while (i< idx-1) {
           temp = temp.next;
           i++; 
        }
        // i = idx-1 temp->prev
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Remove Fist Method
    public int removeFirst(){
        if (size==0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }else if(size ==1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    // Remove Last Method

    public int removeLast(){
        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        // prev : i = size-2
        Node prev = head;
        for(int i =0; i<size-2; i++){
            prev = prev.next;
        }

        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }
 
    // Search(Iterative)
    public int Search(int key){
        Node temp = head;
        int i =0;
        while (temp!=null) {
            if (temp.data==key) {   //key found case
                return i;
            }
            temp = temp.next;
            i++;
        }
        //key not found case
        return-1;
    }

    // Recursin Search
    public int helper(Node head, int key){
        if (head == null) {  //     Base-case
            return -1;
        }
        if (head.data == key) {
            return 0;
        }
        int idx = helper(head.next, key);
        if (idx == -1) {
            return -1;
        }
        return idx+1;
    }
    public int recSearch(int key){
        return helper(head, key);
    }

    // Reverse Linked List
    public void reverse(){
        Node prev = null;
        Node curr = tail = head;
        Node next;
        while (curr!=null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }


    // Delete Nth  From End
    public void deleteNthFromEnd(int n){
        // calculate size
        int sz =0;
        Node temp =head;
        while (temp != null) {
            temp = temp.next;
            sz++;
        }
        if (n==sz) {
           head = head.next;
           return; 
        }
        // size-n
        int i=1;
        int iToFind = sz-n;
        Node prev = head;
        while (i < iToFind) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }
    

    // Palindrome Question
    public Node findMid(Node head){
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next !=null) {
            slow = slow.next;  // +1
            fast = fast.next.next;  //+2
        }
        return slow;  //Slow is my midNode
    }
    public boolean checkPalindrome(){
        // base-case
        if (head == null || head.next == null) {
            return true;
        }
        // Step1 - find mid
        Node midNode = findMid(head);
    
        // Step2 - Reverse 2nd half
        Node prev = null;
        Node curr = midNode;
        Node next;
        while (curr != null) {
           next = curr.next;
           curr.next = prev; 
           prev = curr;
           curr = next;
        }
        Node right = prev;  // right  half head
        Node left = head;

        // step3 - check left and right half
        while (right != null){
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;

        }
        return true;
    }


     public static void main(String[] args) {
        PrintLinked ll = new PrintLinked();
        
        // Printing the LinkedList
        ll.Print();
        // Adding elements to the LinkedList
        ll.addLast(1);
        ll.addLast(2); 
        ll.addLast(2);
        ll.addLast(1);
        // ll.addMiddleLinkedlist(2,3);

        // ll.addMiddleLinkedlist(2,3);
        // ll.Print();
        
        // System.out.println(ll.size);

        // ll.removeFirst();
        // ll.Print();

        // ll.removeLast();
        // ll.Print();

        // System.out.println(ll.Search(3));
        // System.out.println(ll.Search(8));

        // System.out.println(ll.recSearch(3));
        // System.out.println(ll.recSearch(10));

        ll.Print();
        // ll.reverse();

        ll.deleteNthFromEnd(3);
        ll.Print();

        System.out.println(ll.checkPalindrome());

    }
}
 
   // LINKEDLISTPARTA
  // PrintLinked