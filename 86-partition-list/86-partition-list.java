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
    public ListNode partition(ListNode head, int x) {
        ListNode curr = head;
        ListNode dummy1 = new ListNode(-1);
        ListNode dummy2 = new ListNode(-1);
        ListNode h1 = dummy1;
        ListNode h2 = dummy2;
        while(curr!=null){
            if(curr.val<x){
                dummy1.next = curr;
                dummy1 = dummy1.next;
            }else{
                dummy2.next = curr;
                dummy2 = dummy2.next;
            }
            curr = curr.next;
        }
        dummy2.next = null;
        dummy1.next = h2.next;
        return h1.next;
    }
}