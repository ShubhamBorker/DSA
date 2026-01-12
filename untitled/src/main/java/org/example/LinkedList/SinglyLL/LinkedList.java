package org.example.LinkedList.SinglyLL;

public class LinkedList {
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    Node head;

    // Method to insert a new node at the end of the list
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    // Method to display the linked list
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Method to delete a node by value
    public void delete(int key) {
        Node current = head, prev = null;

        // If head node itself holds the key to be deleted
        if (current != null && current.data == key) {
            head = current.next; // Changed head
            return;
        }

        // Search for the key to be deleted, keep track of the previous node
        while (current != null && current.data != key) {
            prev = current;
            current = current.next;
        }

        // If key was not present in linked list
        if (current == null) return;

        // Unlink the node from linked list
        prev.next = current.next;
    }
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Inserting nodes
        list.insert(10);
        list.insert(20);
        list.insert(30);
        System.out.println("Linked List after insertion:");
        list.display();

        // Deleting a node
        list.delete(20);
        System.out.println("Linked List after deleting 20:");
        list.display();
    }
}
