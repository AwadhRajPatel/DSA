package STACK;

import java.util.Stack;

public class ReverseStack {
    public static void pushAtBottom(Stack<Integer> s, int data) {
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }

    public static void StackReverse(Stack<Integer> s){

        if (s.isEmpty()) {
            return;
        }
        int top = s.pop();
        StackReverse(s);
        pushAtBottom(s, top);
    }

    public static void printStack(Stack<Integer> s){
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        System.out.println("Reverse Stack");
        StackReverse(s);
        printStack(s);
    }
}