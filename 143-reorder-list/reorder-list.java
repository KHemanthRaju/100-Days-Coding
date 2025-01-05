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
        ListNode slow = head;
        ListNode fast = head;

        while(fast!=null && fast.next!=null){
            slow= slow.next;
            fast = fast.next.next;
        }

        //Reverse second linkedlist
        ListNode current = slow, prev = null;
        while(current!=null){
            ListNode temp = current.next;
            current.next = prev;
            prev = current;
            current =temp;
        } 

        //Combining both linkedlists
        ListNode first = head;
        ListNode second = prev;
        while(second.next!=null){
            ListNode temp1 = first.next;
            first.next = second;
            ListNode temp2 = second.next;
            second.next = temp1;
            first = temp1;
            second = temp2;
        }
    }
}