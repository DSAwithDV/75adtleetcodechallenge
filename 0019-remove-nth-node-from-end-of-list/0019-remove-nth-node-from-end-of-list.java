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

        ListNode dummy= new ListNode(0);
         dummy.next = head;


        ListNode slow = dummy;
        ListNode fast = dummy;

        //for run fast to n+1
        for(int i=0;i<=n;i++){
            fast=fast.next;
        }

        //dono ko sath chalao
        while(fast!=null){
            slow=slow.next;
            fast=fast.next;
        }
        //for deletion
        slow.next=slow.next.next;

       return dummy.next;

        
    }
}