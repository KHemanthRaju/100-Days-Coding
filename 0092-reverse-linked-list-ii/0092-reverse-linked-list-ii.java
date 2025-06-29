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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head == null || left == right){
            return head;
        }

        ListNode dummy = new ListNode(0,head);
        ListNode leftNode = dummy;
        ListNode currNode = head;

        for(int i=0;i<left-1;i++){
            leftNode = leftNode.next;
            currNode = currNode.next;
        }

        ListNode sublistNode = currNode;
        ListNode prev = null;
        for(int i=0;i<right-left+1;i++){
            ListNode newNode = currNode.next;
            currNode.next = prev;
            prev = currNode;
            currNode = newNode;
        }

        leftNode.next = prev;
        sublistNode.next = currNode; 

        return dummy.next;
    }
}