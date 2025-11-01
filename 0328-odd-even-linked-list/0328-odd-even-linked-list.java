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
    public ListNode oddEvenList(ListNode head) {
        ListNode eventail=new ListNode(0);
        ListNode oddtail=new ListNode(0);
        ListNode evenhead=eventail;
        ListNode oddhead=oddtail;
        ListNode curr=head;
        ListNode temp=null;
        boolean flag=true;
        while(curr!=null){
            //breaking the existing link of nodes from original list
            temp=curr;
            curr=curr.next;
            temp.next=null;
            
            
            
            if(flag){
                eventail.next=temp;
                eventail=temp;
                flag=false;
            }
            else{
                oddtail.next=temp;
                oddtail=temp;
                flag=true;
            }
            // head=head.next;
        }
        eventail.next=oddhead.next;
        oddtail.next=null;
        return evenhead.next;
        
        
    }
}