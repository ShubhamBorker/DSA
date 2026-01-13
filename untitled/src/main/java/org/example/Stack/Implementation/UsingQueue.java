package org.example.Stack.Implementation;

import java.util.LinkedList;
import java.util.Queue;

public class UsingQueue {
    Queue<Integer>queue= new LinkedList<>();

    //push
    public void push(int value){
        queue.add(value);

        for (int i =0; i<queue.size()-1;i++){
            queue.add(queue.remove());
        }
    }

    public int pop(){
        if(queue.isEmpty()){
            System.out.println("Stack is empty");
        }
        return queue.remove();
    }

    public int top(){
        if(queue.isEmpty()){
            System.out.println("Stack is empty");
        }
        return queue.peek();
    }

    public boolean empty(){
        return queue.isEmpty();
    }

    public static void main(String[]args){
        UsingQueue q= new UsingQueue();
        q.push(5);
        q.push(3);
        q.push(7);
        q.push(2);
        System.out.println("Top element " + q.top());
        System.out.println("Pooped element "+ q.pop());
        System.out.println("Top element " + q.top());
    }
}
