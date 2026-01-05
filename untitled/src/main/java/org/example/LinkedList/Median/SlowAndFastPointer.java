package org.example.LinkedList.Median;

import org.example.LinkedList.DoublyLL.Main;

public class SlowAndFastPointer {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static class LinkedList{
        Node head;

        public double findMedian(Node head){
            if (head == null){
                return 0.0;
            }
            Node slow = head;
            Node fast = head;
            Node prevSlow= null;

            while(fast!= null && fast.next!= null){
                prevSlow = slow;
                slow= slow.next;
                fast = fast.next.next;
            }
            // If the length of the list is odd
            if(fast!=null){
                return slow.data;
            } else { // If the length of the list is even
                return (prevSlow.data + slow.data) / 2.0;
            }
        }

        public void insert(int data){
            Node newNode = new Node(data);
            if (head == null){
                head = newNode;
                return;
            }
            Node current = head;
            while (current.next != null){
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public static void main(String[] args){
        LinkedList list = new LinkedList();
        list.insert(1);
        list.insert(3);
        list.insert(5);
        list.insert(7);
        list.insert(9); // Odd length list
        System.out.println("Median of the linked list: " + list.findMedian(list.head)); // Output: 5.0

        LinkedList list2 = new LinkedList();
        list2.insert(1);
        list2.insert(2);
        list2.insert(3);
        list2.insert(4); // Even length list
        System.out.println("Median of the linked list: " + list2.findMedian(list2.head)); // Output: 2.5
    }
}
