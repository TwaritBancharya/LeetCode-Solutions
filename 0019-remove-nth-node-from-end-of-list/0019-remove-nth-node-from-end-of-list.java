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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp=head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        int number=count-n+1;
         if(head==null){
            return head;
         }
         if(head.next==null && n==1){
               head=null;
               return head;
         }
         if(n==count){
            head=head.next;
            return head;
         }
         ListNode t=head;
         ListNode tN=head.next;
         int p=2;
         while(p!=number){
            p++;
            t=t.next;
            tN=tN.next;
         }
         t.next=tN.next;
         return head;
    }

}