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
    public void reorderList(ListNode head) {
        if (head==null || head.next==null){///mean the lisyt is empty
            return;
        }
        ListNode slow=head;
        ListNode fast=head;

        //for find midddle list
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        //split and revrese second half
        ///for split
        ListNode second = slow.next;
        slow.next=null;//for divede it intoo two list

        //reverse
        
        ListNode prev = null;
        ListNode curr = second;

        while(curr!=null){
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        ///merge

        ListNode first = head;
        ListNode secondHalf= prev;

        while(secondHalf!=null){
            ListNode temp1 = first.next;
            ListNode temp2 = secondHalf.next;

            first.next=secondHalf;
            secondHalf.next = temp1;

            first=temp1;
            secondHalf=temp2;
        }

    }
}