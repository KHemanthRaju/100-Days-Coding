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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next==null || k==0) return head;
        int len = 1;
        ListNode fast = head;
    while(fast.next != null) {
        fast = fast.next;
        len++;
    }
    k %= len;
        while(k>0){
        ListNode dummy = new ListNode(0,head);
        ListNode slow = dummy;
        fast = head;
        while(fast.next!=null && fast!=null){
            slow = slow.next;
            fast = fast.next;
        }
        fast.next = head;
        slow.next = null;
            k--;
            head = fast;
        }
        return head;
    }
}