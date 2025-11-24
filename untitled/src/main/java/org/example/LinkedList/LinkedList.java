package org.example.LinkedList;

public class LinkedList {
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
}
