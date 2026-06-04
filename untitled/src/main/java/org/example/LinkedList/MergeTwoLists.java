package org.example.LinkedList;

public class MergeTwoLists {

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2){
        ListNode dummy=new ListNode(-1);
        ListNode tail=dummy;

        while (list1!=null && list2!=null){
            if (list1.val<=list2.val){
                tail.next=list1;
                list1=list1.next;
            }else {
                tail.next=list2;
                list2=list2.next;
            }
            tail=tail.next;
        }

        if (list1!=null) tail.next=list1;
        if (list2!=null) tail.next=list2;

        return dummy.next;
    }

    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Create first sorted list: 1 -> 3 -> 5
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(3);
        list1.next.next = new ListNode(5);

        // Create second sorted list: 2 -> 4 -> 6
        ListNode list2 = new ListNode(2);
        list2.next = new ListNode(4);
        list2.next.next = new ListNode(6);

        // Merge using brute force
        MergeTwoLists obj = new MergeTwoLists();
        ListNode mergedHead = obj.mergeTwoLists(list1, list2);

        // Print merged list
        System.out.print("Merged List: ");
        printList(mergedHead);
    }
}
