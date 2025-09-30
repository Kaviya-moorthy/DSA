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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null){
            return head;
        }
        int length=1;
        ListNode temp=head;
        while(temp.next!=null){
            temp=temp.next;
            length++;
        }
         k=k%length;
         if(k==0){
            return head;
         }
          temp.next=head;

         int nk=length-k;
         ListNode newtemp=head;
         for(int i=1;i<nk;i++){
            newtemp=newtemp.next;
         }
         ListNode newhead=newtemp.next;
         newtemp.next=null;

         return newhead;

    }
}