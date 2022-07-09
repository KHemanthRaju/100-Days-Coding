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
    public ListNode swapPairs(ListNode head) {
        if(head == null){
            return null;
        }
        ListNode curr = head;
        ListNode prev = null;
        ListNode nxt = null;
        int count=0;
        
        while(curr!=null && count<2){
            nxt = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nxt;
            count++;
        }
        
        if(nxt!=null){
            head.next = swapPairs(nxt);
        }
        
        return prev;
    }
}