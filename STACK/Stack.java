package STACK;

import java.util.ArrayList;

public class Stack {
    static class StackB {
        static ArrayList<Integer> list = new ArrayList<>();

        public static boolean isEmpty() {
            return list.size() == 0;
        }

        // push
        public static void push(int data) {
            list.add(data);
        }

        // pop
        public static int pop() {
            if (isEmpty()) {
                return -1;
            }

            int top = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return top;
        }

        // peek
        public static int peek() {
            if (isEmpty()) {
                return -1;
            }
            return list.get(list.size() - 1);
        }
    }

    public static void main(String[] args) {
        // Use StackB directly since its methods are static
        StackB.push(1);
        StackB.push(2);
        StackB.push(3);

        while (!StackB.isEmpty()) {
            System.out.println(StackB.peek());
            StackB.pop();

            // StackB s = new StackB();
            // s.push(1);
            // s.push(2);
            // s.push(3);

            // while (!s.isEmpty()) {
            // System.out.println(s.peek());
            // s.pop();
        }
    }
}
