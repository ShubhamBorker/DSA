package org.example.Queue.Implementation;

import java.util.Queue;

public class QueueUsingArray {
    private int[] arr;
    private int rear;
    private int front;
    private int capacity;
    private int count;

    public QueueUsingArray(int size){
        arr= new int[size];
        capacity=size;
        rear =-1;
        front=0;
        count=0;

    }

    public void enqueue(int item){
        if (isFull()){
            System.out.println("Queue overflow");
            return;
        }
        rear=(rear + 1)%capacity;
        arr[rear]=item;
        count++;
    }

    public int dequeue(){
        if (isEmpty()){
            System.out.println("Queue underflow");
            return -1;
        }
        int item =arr[front];
        front=(front+1)%capacity;
        count --;
        return item;
    }

    public int peek(){
        if (isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        return arr[front];
    }

    public boolean isEmpty(){
        return count ==0;
    }

    public boolean isFull(){
        return count==capacity;
    }

    public int size() {
        return count;
    }


    public static void main(String[]args){
        QueueUsingArray queue=new QueueUsingArray(5);
        queue.enqueue(4);
        queue.enqueue(6);
        queue.enqueue(2);
        System.out.println("Size of queue" + queue.size());
        System.out.println("Top element "+ queue.peek());

        queue.dequeue();
        System.out.println("Size of queue "+ queue.size());
        System.out.println("Fromt element" + queue.peek());
    }


}
