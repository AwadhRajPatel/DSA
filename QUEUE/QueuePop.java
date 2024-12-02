package QUEUE;

import java.util.LinkedList;
import java.util.Queue;

public class QueuePop {
    static class Stack {
        static Queue<Integer> q1 = new LinkedList<>();
        static Queue<Integer> q2 = new LinkedList<>();

        public static boolean isEmpty() {
            return q1.isEmpty() && q2.isEmpty();
        }

        public static void push(int data) {
            if (!q1.isEmpty()) {
                q1.add(data);
            } else {
                q2.add(data);
            }
        }

        public static int pop() {
            if (isEmpty()) {
                System.out.println("empty stack");
                return -1;
            }
            int top = -1;

            if (!q1.isEmpty()) {
                // Transfer all except last element to q2
                while (q1.size() > 1) {
                    q2.add(q1.remove());
                }
                top = q1.remove(); // Remove the last element
            } else {
                // Transfer all except last element to q1
                while (q2.size() > 1) {
                    q1.add(q2.remove());
                }
                top = q2.remove(); // Remove the last element
            }

            return top;
        }

        public static int peek() {
            if (isEmpty()) {
                System.out.println("empty stack");
                return -1;
            }
            int top = -1;

            if (!q1.isEmpty()) {
                // Transfer all elements to q2 to find the top
                while (!q1.isEmpty()) {
                    top = q1.remove();
                    q2.add(top);
                }
            } else {
                // Transfer all elements to q1 to find the top
                while (!q2.isEmpty()) {
                    top = q2.remove();
                    q1.add(top);
                }
            }

            return top;
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        while (!s.isEmpty()) {
            System.out.println(s.peek()); // Print the top element
            s.pop();                      // Remove the top element
        }
    }
}
