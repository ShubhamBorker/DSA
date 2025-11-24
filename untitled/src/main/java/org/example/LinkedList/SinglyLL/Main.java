package org.example.LinkedList.SinglyLL;

public class Main {
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
