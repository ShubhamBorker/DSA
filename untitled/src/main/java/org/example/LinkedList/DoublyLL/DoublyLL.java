package org.example.LinkedList.DoublyLL;

public class DoublyLL {
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
        newNode.prev = current;
    }

    // Method to display the linked list
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " <-> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Method to delete a node by value
    public void delete(int key) {
        Node current = head;

        // Traverse the list to find the node to be deleted
        while (current != null && current.data != key) {
            current = current.next;
        }

        // If the node was not found
        if (current == null) return;

        // If the node to be deleted is the head node
        if (current == head) {
            head = current.next;
            if (head != null) {
                head.prev = null;
            }
            return;
        }

        // Unlink the node from the linked list
        if (current.next != null) {
            current.next.prev = current.prev;
        }
        if (current.prev != null) {
            current.prev.next = current.next;
        }
    }
}
