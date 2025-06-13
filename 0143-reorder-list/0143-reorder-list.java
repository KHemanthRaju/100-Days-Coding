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
        if(head == null || head.next == null) return;

        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode second = reverseList(slow.next);
        slow.next = null;
        ListNode first = head;

        while(second!=null){
            ListNode temp1 = first.next;
            ListNode temp2 = second.next;

            first.next =second;
            second.next = temp1;

            first = temp1;
            second = temp2;
        }
    }

    public ListNode reverseList(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        while(curr!=null){
            ListNode forw = curr.next;
            curr.next = prev;
            prev = curr;
            curr = forw;
        }
        return prev;
    }
}