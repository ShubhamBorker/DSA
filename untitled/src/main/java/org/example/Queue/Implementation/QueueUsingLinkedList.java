package org.example.Queue.Implementation;

public class QueueUsingLinkedList {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
        private Node front, rear;

        public QueueUsingLinkedList() {
            this.front = this.rear = null;
        }

        // Enqueue: add element at rear
        public void enqueue(int x) {
            Node newNode = new Node(x);

            // If queue is empty
            if (rear == null) {
                front = rear = newNode;
                return;
            }

            // Link new node at the end and update rear
            rear.next = newNode;
            rear = newNode;
        }

        // Dequeue: remove element from front
        public int dequeue() {
            if (front == null) throw new RuntimeException("Queue is empty");

            int value = front.data;
            front = front.next;

            // If queue becomes empty
            if (front == null) {
                rear = null;
            }

            return value;
        }

        // Peek: get front element
        public int peek() {
            if (front == null) throw new RuntimeException("Queue is empty");
            return front.data;
        }

        // Check if empty
        public boolean isEmpty() {
            return front == null;
        }

        public static void main(String[]args){
            QueueUsingLinkedList qll=new QueueUsingLinkedList();
            qll.enqueue(3);
            qll.enqueue(2);
            qll.enqueue(9);
            System.out.println("Top element " + qll.peek());
            System.out.println("Pooped element " + qll.dequeue());
            System.out.println("Top element " + qll.peek());
        }
    }
