package org.example.Queue.Implementation.UsingStack;

import java.util.Queue;
import java.util.Stack;

public class CostlyDequeue {
    Stack<Integer> stack1= new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    //enqueue
    public void enqueue(int value){
        stack1.push(value);
    }

    //dequeu
    public int dequeue(){
        if (stack1.isEmpty() && stack2.isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        if (stack2.isEmpty()){
            while (!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }

    //peek
    public int peek(){
        if (stack1.isEmpty() && stack2.isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }

        if (stack2.isEmpty()){
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        return stack2.peek();
    }

    public boolean isEmpty(){
        return stack1.isEmpty() && stack2.isEmpty();
    }

    public static void main(String[] args){
        CostlyDequeue queue = new CostlyDequeue();

        queue.enqueue(5);
        queue.enqueue(9);
        queue.enqueue(3);
        queue.enqueue(0);

        System.out.println("Top element of queue "+ queue.peek());
        System.out.println("popped value "+ queue.dequeue());
        System.out.println("Top element of queue "+ queue.peek());

    }
}
