package org.example.Stack.Implementation;

public class UsingLinkedList {

    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    private Node top;

    UsingLinkedList(){
        this.top=null;
    }

    public void push(int data){
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
        System.out.println( data +" pushed to stack");
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }
        int popped = top.data;
        top = top.next;
        return popped;
    }

    public int peek(){
        if (isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        return top.data;
    }

    public boolean isEmpty(){
        return top == null;
    }

    public static void main(String [] args){
        UsingLinkedList stack = new UsingLinkedList();

        stack.push(2);
        stack.push(4);
        stack.push(7);
        stack.push(3);

        System.out.println("Top element " + stack.peek());
        System.out.println("Pooped " + stack.pop());
        System.out.println("Top element " + stack.peek());
    }

}




