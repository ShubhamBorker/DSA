package org.example.Stack;

import java.util.Stack;

public class MinStack {
    Stack<Integer>stack;
    Stack<Integer>minStack;

    public MinStack(){
        stack=new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int value){
        stack.push(value);
        if(minStack.isEmpty() || value<= minStack.peek()){
            minStack.push(value);
        }
        System.out.println(value +" pushed");
    }

    public int pop() {
        if (stack.isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }
        int val = stack.pop();
        if (val == minStack.peek()) {
            minStack.pop();
        }
        return val;
    }

    public int peek(){
        if (stack.isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return stack.peek();
    }

    public int getMin(){
        if (minStack.isEmpty()){
            System.out.println("MinStack is empty");
            return -1;
        }
        return minStack.peek();
    }

    public boolean isEmpty(){
        return stack.isEmpty();
    }

    public static void main(String[]args){
        MinStack minStack1=new MinStack();

        minStack1.push(6);
        minStack1.push(4);
        minStack1.push(8);
        minStack1.push(10);
        minStack1.push(2);

        System.out.println("Current Minimum " + minStack1.getMin());
        System.out.println("pooped " +minStack1.pop());
        System.out.println("Current Minimum " + minStack1.getMin());
    }

}
