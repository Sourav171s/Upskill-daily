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

    public static ListNode torhare(ListNode head){
        ListNode fast=head;
        ListNode slow=head;
        while(fast.next!=null && fast.next.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }

    public static ListNode merge(ListNode ls,ListNode rs){
        ListNode dummy=new ListNode(0);
        ListNode temp=dummy;
        while(ls!=null && rs!=null){
            if(ls.val<=rs.val){
                temp.next=ls;
                temp=ls;
                ls=ls.next;
            }
            else{
                temp.next=rs;
                temp=rs;
                rs=rs.next;
            }

        }

        if(ls!=null){
            temp.next=ls;
        }
        else{
            temp.next=rs;
        }
        return dummy.next;



    }




    public static ListNode mergesort(ListNode head){
        //base case
        if(head==null || head.next==null){
            return head;
        }

        ListNode mid=torhare(head);
        ListNode left=head;
        ListNode right=mid.next;
        mid.next=null;                       //to separate both the lists

        left=mergesort(left);
        right=mergesort(right);
        return merge(left,right);
          
    }















    public ListNode sortList(ListNode head) {
        // ListNode dummy=new ListNode(0);
        // boolean flag=false;
        // ListNode curr=head;
        // ListNode temp=null;
        // ListNode prev=dummy;

        //                            //this approach is giving tle at last input because insertion sort is useful for generally smaller inputs but for larger inputs it give tle 
        // while(curr!=null){
            
        //     //unlinking the nodes from the list
        //     temp=curr;
        //     curr=curr.next;
        //     temp.next=null;

        //     if(flag==false){
        //         dummy.next=temp;
        //         dummy=temp;
        //         flag=true;
        //     }
        //     else{
        //         if(prev.next.val>=temp.val){
        //             temp.next=prev.next;
        //             prev.next=temp;
        //         }
        //         else{
        //             ListNode ex=prev.next;
        //             while(ex.next!=null && ex.next.val<temp.val){
        //                 ex=ex.next;
        //             }
        //             if(ex.next==null){
        //                 ex.next=temp;
        //             }
        //             else{
        //                 temp.next=ex.next;
        //                 ex.next=temp;
        //             }
        //         }
        //     }
        // }
        // return prev.next;

        
                                  //now we are using merge sort here to do this in O(nlogn) T.C 
        return mergesort(head);

    }
}