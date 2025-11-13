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
    public ListNode reverseList(ListNode head) {
        if(head==null){
            return null;
        }
        ListNode dummy = new ListNode(0);
        ListNode prev = null;
        dummy.next = head;
        ListNode cur = head;
        ListNode forw = head;
        while(cur!=null){
            forw = cur.next;
            cur.next = prev;
            prev =cur;
            cur = forw;
        }
        return prev;
    }
}