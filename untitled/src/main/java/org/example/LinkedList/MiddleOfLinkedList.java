package org.example.LinkedList;

public class MiddleOfLinkedList {

    public ListNode middleNodeBrute(ListNode head) {
        int count = 0;
        ListNode temp = head;
        // Count nodes
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        // Find middle index (second middle if even)
        int mid = count / 2;
        // Traverse again to reach middle
        temp = head;
        for (int i = 0; i < mid; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public static ListNode middleLLOpt(ListNode head){
        ListNode fast=head;
        ListNode slow=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    // Utility function to print a linked list
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Create sample list: 1 -> 2 -> 3 -> 4 -> 5 -> 6
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);

        System.out.print("Original List: ");
        printList(head);

        MiddleOfLinkedList obj = new MiddleOfLinkedList();

        // Brute force result
        ListNode middleBrute = obj.middleNodeBrute(head);
        System.out.println("Middle (Brute Force): " + middleBrute.val);

        // Optimized result
        ListNode middleOptimized = obj.middleLLOpt(head);
        System.out.println("Middle (Optimized): " + middleOptimized.val);
    }

}
