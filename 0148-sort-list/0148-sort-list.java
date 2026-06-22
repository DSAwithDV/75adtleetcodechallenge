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

    public ListNode sortList(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }

        ListNode slow = head;
        ListNode fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode second = slow.next;
        slow.next = null;

        ListNode firstHalf = sortList(head);
        ListNode secondHalf = sortList(second);

        return merge(firstHalf, secondHalf);
    }

    private ListNode merge(ListNode firstHalf, ListNode secondHalf) {

        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;

        while (firstHalf != null && secondHalf != null) {

            if (firstHalf.val <= secondHalf.val) {
                temp.next = firstHalf;
                firstHalf = firstHalf.next;
            } else {
                temp.next = secondHalf;
                secondHalf = secondHalf.next;
            }

            temp = temp.next;
        }

        if (firstHalf != null) {
            temp.next = firstHalf;
        }

        if (secondHalf != null) {
            temp.next = secondHalf;
        }

        return dummy.next;
    }
}