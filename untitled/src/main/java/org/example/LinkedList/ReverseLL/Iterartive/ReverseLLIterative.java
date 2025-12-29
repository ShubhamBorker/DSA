package org.example.LinkedList.ReverseLL.Iterartive;

public class ReverseLLIterative {
    static class ListNode{
        int data;
        ListNode next;
        ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }

    // Method to reverse the linked list iteratively
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;

        while (current != null) {
            ListNode next = current.next; // Store next node
            current.next = prev; // Reverse link
            prev = current;      // Move prev forward
            current = next;     //Move current forward
        }
        return prev; // New head of the reversed list
    }

    //Helper method to print the linked list
    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static ListNode buildList(int[] values) {
        if (values.length == 0) return null;
        ListNode head = new ListNode(values[0]);
        ListNode current = head;
        for (int i = 1; i < values.length; i++) {
            current.next = new ListNode(values[i]);
            current = current.next;
        }
        return head;
    }

    public static void main(String[] args) {
        ReverseLLIterative listOps = new ReverseLLIterative();
        int[] values = {1, 2, 3, 4, 5};
        ListNode head = buildList(values);

        System.out.println("Original List:");
        printList(head);

        head = listOps.reverseList(head);

        System.out.println("Reversed List:");
        printList(head);
    }
}
