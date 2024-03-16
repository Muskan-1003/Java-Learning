public class ReorderList {


     public class ListNode {
        int val;
          ListNode next;
          ListNode() {}
     ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }
    class Solution {
        public void reorderList(ListNode head) {
            if(head== null || head.next==null){
                return;
            }
            ListNode mid=middleNode(head);
            ListNode hs=reverseList(mid);
            ListNode hf=head;

            while(hf!= null && hs != null){
                ListNode temp=hf.next;
                hf.next=hs;
                hf=temp;

                temp=hs.next;
                hs.next=hf;
                hs=temp;
            }

            if(hf!= null){
                hf.next=null;
            }

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
