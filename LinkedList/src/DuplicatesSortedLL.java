public class DuplicatesSortedLL {
    public static void main(String[] args) {

    }
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode() {}
     * ListNode(int val) { this.val = val; }
     * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */

        public ListNode deleteDuplicates(ListNode head) {
            if (head == null || head.next == null) {
                return head; // No duplicates to delete in a list with 0 or 1 node
            }
            ListNode node = head;
            // ListNode tail = null; // Initialize tail here
            // int size = 0; // Initialize size here

            while (node != null && node.next != null) {
                if (node.val == node.next.val) {
                    node.next = node.next.next;
                    // size--;
                } else {
                    node = node.next;
                }
            }
            // tail = node;
            // tail.next = null;

            return head;
        }

    }

