package org.example.LinkedList.Median;

public class TwoPassApproch {
    static class ListNode {
        int data;
        ListNode next;

        ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Method to find the median of the linked list using two-pass approach
    public double findMedian(ListNode head) {
        if (head == null) return 0.0;

        // First pass: Calculate the length of the linked list
        int length = 0;
        ListNode current = head;
        while (current != null) {
            length++;
            current = current.next;
        }

        // Second pass: Find the median
        current = head;
        for (int i = 0; i < (length - 1) / 2; i++) {
            current = current.next;
        }

        // If length is odd, return the middle element
        if (length % 2 != 0) {
            return current.data;
        } else { // If length is even, return the average of the two middle elements
            return (current.data + current.next.data) / 2.0;
        }
    }

    public static void main(String[] args) {
        TwoPassApproch listOps = new TwoPassApproch();

        // Creating a sample linked list: 1 -> 3 -> 5 -> 7 -> 9
        ListNode head = new ListNode(1);
        head.next = new ListNode(3);
        head.next.next = new ListNode(5);
        head.next.next.next = new ListNode(7);
        head.next.next.next.next = new ListNode(9);

        double median = listOps.findMedian(head);
        System.out.println("Median of the linked list: " + median); // Output: 5.0

        // Creating another sample linked list: 1 -> 2 -> 3 -> 4
        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(2);
        head2.next.next = new ListNode(3);
        head2.next.next.next = new ListNode(4);

        double median2 = listOps.findMedian(head2);
        System.out.println("Median of the linked list: " + median2); // Output: 2.5
    }

}
