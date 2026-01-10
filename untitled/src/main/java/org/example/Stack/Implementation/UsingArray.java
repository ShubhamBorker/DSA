package org.example.Stack.Implementation;

public class UsingArray {
    private int maxsize;
    private int[] stack;
    private int top;

    public UsingArray(int size){
        maxsize= size;
        stack = new int[maxsize];
        top=-1;
    }

    //push
    public void push(int value){
        if(isFull()){
            System.out.println("Stack Overflow");
            return;
        }
        stack[++top]=value;
        System.out.println(value +" pushed");
    }

    //pop
    public int pop(){
        if(isEmpty()){
            System.out.println("Stack Underflow");
            return -1;
        }
        return stack[top--];
    }

    //peek
    public int peek(){
        if (isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        return stack[top];
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public boolean isFull(){
        return top == maxsize-1;
    }

    public static void main(String[]args){
        UsingArray stack = new UsingArray(5);
        stack.push(7);
        stack.push(4);
        stack.push(2);
        stack.push(1);

        System.out.println("Top element " + stack.peek());
        System.out.println("Top removed "+ stack.pop());
        System.out.println("Top element after pop " + stack.peek());

    }
}

