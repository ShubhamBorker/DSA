package org.example.LinkedList.Cycle;

public class DetectCycle {
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class LinkedList {
        Node head;

        // Detect cycle using Floyd’s algorithm
        boolean hasCycle(Node head) {
            if (head == null) return false;
            Node slow = head, fast = head;

            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
                if (slow == fast) return true; // cycle detected
            }
            return false;
        }

        // Detect cycle and return starting node if exists
        Node detectCycleStart(Node head) {
            if (head == null) return null;
            Node slow = head, fast = head;

            // Step 1: Detect cycle
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;

                if (slow == fast) { // cycle detected
                    // Step 2: Find cycle start
                    slow = head;
                    while (slow != fast) {
                        slow = slow.next;
                        fast = fast.next;
                    }
                    return slow; // start of cycle
                }
            }
            return null; // no cycle
        }

        // Find cycle length
        int cycleLength(Node head) {
            if (head == null) return 0;
            Node slow = head, fast = head;

            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;

                if (slow == fast) { // cycle detected
                    int length = 1;
                    Node temp = slow.next;
                    while (temp != slow) {
                        temp = temp.next;
                        length++;
                    }
                    return length;
                }
            }
            return 0; // no cycle
        }
        void removeCycle(Node head) {
            Node cycleStart = detectCycleStart(head);
            if (cycleStart == null) return; // no cycle

            // Traverse cycle to find last node
            Node temp = cycleStart;
            while (temp.next != cycleStart) {
                temp = temp.next;
            }
            temp.next = null; // break the cycle
        }

    }
        public static void main(String[] args) {
            LinkedList list = new LinkedList();
            list.head = new Node(1);
            list.head.next = new Node(2);
            list.head.next.next = new Node(3);
            list.head.next.next.next = new Node(4);

            // Create a cycle: 4 -> 2
            list.head.next.next.next.next = list.head.next;

            // Check cycle
            System.out.println("Cycle detected: " + list.hasCycle(list.head));

            // Find cycle start
            Node cycleStart = list.detectCycleStart(list.head);
            if (cycleStart != null) {
                System.out.println("Cycle starts at node with value: " + cycleStart.data);
            } else {
                System.out.println("No cycle detected.");
            }

            // Find cycle length
            int cycleLen = list.cycleLength(list.head);
            if (cycleLen > 0) {
                System.out.println("Cycle length is: " + cycleLen);
            }

            // Remove cycle
            list.removeCycle(list.head);

            // Display after removal
            System.out.println("List after removing cycle:");
            System.out.println("Cycle detected: " + list.hasCycle(list.head));

        }
    }
