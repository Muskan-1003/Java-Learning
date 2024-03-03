public class Pallindrome {

     public class ListNode {
        int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }
 class Solution {
        public boolean isPalindrome(ListNode head) {
            ListNode mid = middleNode(head);
            ListNode headSecond = reverseList(mid);

            while (head != null && headSecond != null) {
                if (head.val != headSecond.val) {
                    return false;
                }

                head = head.next;
                headSecond = headSecond.next;
            }

            return true;
        }

        ListNode middleNode(ListNode head) {
            ListNode slow = head;
            ListNode fast = head;

            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }

            return slow;
        }

        ListNode reverseList(ListNode head) {
            ListNode prev = null;
            ListNode current = head;
            ListNode next = null;

            while (current != null) {
                next = current.next;
                current.next = prev;
                prev = current;
                current = next;
            }

            head = prev;
            return head;
        }
    }

}
