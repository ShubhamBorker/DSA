package org.example.Queue.Implementation.UsingStack;

import java.util.Stack;

public class CostlyEnqueue {
    Stack<Integer> st1 = new Stack<>();
    Stack<Integer> st2 = new Stack<>();

    //enqueue
    public void enqueue(int value){
            while (!st1.isEmpty()){
                st2.push(st1.pop());
            }
            st1.push(value);

        while (!st2.isEmpty()) {
            st1.push(st2.pop());
        }
    }

    //dequeue
    public int dequeue(){
        if (st1.isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        return st1.pop();
    }

    //peek
    public int peek(){
        if (st1.isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        return st1.peek();
    }

    public static void main(String[]args){
        CostlyEnqueue queue = new CostlyEnqueue();
        queue.enqueue(8);
        queue.enqueue(4);
        queue.enqueue(5);

        System.out.println("Top element " + queue.peek());
        System.out.println("Pooped element " + queue.dequeue());
        System.out.println("Top element " + queue.peek());
    }
}
