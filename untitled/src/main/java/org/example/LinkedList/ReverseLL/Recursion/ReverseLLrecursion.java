package org.example.LinkedList.ReverseLL.Recursion;

public class ReverseLLrecursion {

    static class ListNode{
        int data;
        ListNode next;
        ListNode(int data){
            this.data=data;
            this.next=null;
        }
    }
    // Method to reverse the linked list recursively
    public ListNode reverseList(ListNode head) {
        // Base case: if head is null or only one node, return head
        if (head == null || head.next == null){
            return head;
        }
        // Recursive case: reverse the rest of the list
        ListNode newHead = reverseList(head.next);
        head.next.next = head; // Make the next node point to current node
        head.next = null; // Set current node's next to null
        return newHead; // Return the new head of the reversed list
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
        ReverseLLrecursion listOps = new ReverseLLrecursion();
        int[] values = {1, 2, 3, 4, 5};
        ListNode head = buildList(values);

        System.out.println("Original List:");
        printList(head);

        head = listOps.reverseList(head);

        System.out.println("Reversed List:");
        printList(head);
    }
}
