public class MergeSort {
    //4->2->1->3

    public class Node {
 int val;
 Node next;
  Node() {}
  Node(int val) { this.val = val; }
  Node(int val, Node next) { this.val = val; this.next = next; }
  }

    public Node sortList(Node head) {
        if(head==null || head.next == null){
            return head;
        }
        Node mid=getMid(head);
        Node left=sortList(head);
        Node right=sortList(mid);

        return merge(left,right);
    }

    Node getMid(Node head){
        //4->2->1->3

        Node midPrev=null;
        while(head!= null && head.next!=null){
            midPrev=(midPrev==null)?head:midPrev.next;
            head=head.next.next;
        }
        Node mid=midPrev.next;
        midPrev.next=null;
        return mid;
    }

    public Node merge(Node list1, Node list2){
           Node dummyHead=new Node();
           Node tail=dummyHead;
           while (list1!=null && list2 != null){
               if(list1.val>list2.val){
                   list1=list1.next;
                   tail.next=list1;
                   tail=tail.next;
               }else
               {
                   list2=list2.next;
                   tail.next=list2;
                   tail=tail.next;
               }
           }
           tail.next=(list1==null)?list2:list1;
           return dummyHead.next;
    }
}
