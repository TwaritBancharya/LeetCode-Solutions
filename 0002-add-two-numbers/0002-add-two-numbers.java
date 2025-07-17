/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
     if(l1==null && l2==null){
        return null;
     }else if(l1==null){
        return l2;
     }  else if(l2==null){
        return l1;
     }
        ListNode head1=l1;
        ListNode head2=l2;
        ListNode dummy=new ListNode(0);
        ListNode temp=dummy;
        int carry=0;
        while(head1!=null && head2!=null){
              int sum=head1.val + head2.val + carry;
              carry=sum/10;
              sum=sum-carry*10;
              ListNode node=new ListNode(sum);
              temp.next=node;
              temp=temp.next;
              head1=head1.next;
              head2=head2.next;
        }
        if(head1==null){
            while(head2!=null){
                int value=carry + head2.val;
                  carry=value/10;
                  value=value-carry*10;
                ListNode node=new ListNode(value);
                temp.next=node;
                temp=temp.next;
                head2=head2.next;

            }
        }else if(head2==null){
                while(head1!=null){
                int value=carry + head1.val;
                  carry=value/10;
                  value=value-carry*10;
                ListNode node=new ListNode(value);
                temp.next=node;
                temp=temp.next;
                head1=head1.next;

            }
            }
            if(carry!=0){
                ListNode node=new ListNode(carry);
                temp.next=node;
            }
          return dummy.next;
    }
}