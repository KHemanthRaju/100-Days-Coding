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
        ListNode dummy = new ListNode(0); // Dummy node to handle edge cases
        dummy.next = head;

        ListNode slow = dummy;
        ListNode fast = dummy;
        for(int i=0;i<=n;i++){
            fast = fast.next;
        }
         // Move both pointers until fast reaches the end
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }

        // Remove the nth node from end
        slow.next = slow.next.next;

        return dummy.next;
    }
}