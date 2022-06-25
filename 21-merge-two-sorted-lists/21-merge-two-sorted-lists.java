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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode start = head;
        while(l1!=null && l2!=null){
            if(l1.val<=l2.val){
                start.next = l1;
                l1 = l1.next;
            }else{
                start.next = l2;
                l2 = l2.next;
            }
            start = start.next;
        }
        if (l1 != null) {
            start.next = l1;
        } else if (l2 != null) {
            start.next = l2;
        }
        return head.next;
    }
}