package org.example.LinkedList;

class ListNode {
    int val;
    ListNode next;
    ListNode(int val) { this.val = val; }
}

public class OddEvenLinkedList {
    public static ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode odd = head, even = head.next, evenHead = even;

        // Rearrange nodes
        while (even != null && even.next != null) {
            odd.next = odd.next.next;   // link odd to next odd
            odd = odd.next;

            even.next = even.next.next; // link even to next even
            even = even.next;
        }

        // Attach even list after odd list
        odd.next = evenHead;
        return head;
    }

    // Utility to print list
    public static void printList(ListNode head) {
        for (ListNode curr = head; curr != null; curr = curr.next)
            System.out.print(curr.val + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        // Example: 1 → 2 → 3 → 4 → 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        head = oddEvenList(head);
        printList(head); // Output: 1 3 5 2 4
    }
}