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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0){
            return null;
        }
        return merge(lists,0,lists.length-1);}

        private ListNode merge(ListNode[] lists , int left,int right){

            if(left == right){
                return lists[left];
            }
            int mid = left+(right-left)/2;

            ListNode l1 = merge(lists,left,mid);
            ListNode l2 = merge(lists,mid+1,right);

            return mergeTwoLists(l1,l2);}


            private ListNode mergeTwoLists(ListNode list1,ListNode list2){
                 ListNode dummy = new ListNode (0);
                 ListNode temp = dummy;

                 while(list1 != null && list2 != null){
                    if(list1.val<list2.val){
                        temp.next=list1;
                        list1 = list1.next;
                    }else{
                        temp.next=list2;
                        list2 =list2.next;
                    }
                    temp= temp.next;}

                    if(list1!=null){
                        temp.next=list1;
                    }
                    if(list2!=null){
                        temp.next=list2;
                    }
                    return dummy.next;
                 }
            }
        

    
