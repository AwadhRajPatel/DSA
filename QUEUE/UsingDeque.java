package QUEUE;

import java.util.*;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

import QUEUE.UsingDeque.Stack.MyQueue;

public class UsingDeque {
    static class Stack{
        Deque<Integer> deque = new LinkedList<>();

        public void push(int data){
            deque.addLast(data);
        }

        public int pop(){
            return deque.removeLast();
        }

        public int peek(){
            return deque.getLast();
        }

        static class MyQueue{
            Deque<Integer> deque = new LinkedList<>();

            public void add(int data){
                deque.addLast(data);
            }

            public int remove(){
                return deque.removeFirst();
            }
            public int peek(){
                return deque.getFirst();
            }
        }
    }
    public static void main(String[] args) {
        
        MyQueue q = new MyQueue();
        q.add(10);
        q.add(20);
        q.add(30);

        System.out.println("Queue Peek = " + q.peek());
        System.out.println(q.remove());
        System.out.println(q.remove());         
        System.out.println(q.remove());  

        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        System.out.println("Peek = " + s.peek());

        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
    }
}
