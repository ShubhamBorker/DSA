package org.example.LinkedList.DoublyLL;

public class Main {
    public static void main(String[] args) {
        DoublyLL list = new DoublyLL();

        // Inserting nodes
        list.insert(10);
        list.insert(20);
        list.insert(30);
        System.out.println("Doubly Linked List after insertion:");
        list.display();

        // Deleting a node
        list.delete(20);
        System.out.println("Doubly Linked List after deleting 20:");
        list.display();
    }
}
