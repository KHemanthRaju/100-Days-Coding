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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        l1 = reverse(l1);
        l2 = reverse(l2);
        ListNode head = new ListNode(-1);
        ListNode curr = head;
        int carry = 0;
        if(l1==null && l2==null){
            return null;
        }
        if(l1==null) return l2;
        if(l2==null) return l1;
        while(l1!=null || l2!=null){
            int x = l1!=null ? l1.val:0;
            int y = l2!=null ? l2.val:0;
            int sum = carry+x+y;
            carry = sum/10;
            head.next = new ListNode(sum%10);
            head = head.next;
            if(l1!=null){
                l1 = l1.next;
            }
            if(l2!=null){
                l2 = l2.next;
            }
        }
        if(carry>0){
            head.next = new ListNode(carry);
        }
        return reverse(curr.next);
        
    }
    public ListNode reverse(ListNode head){
        ListNode curr = head;
        ListNode prev = null;
        ListNode nxt = null;
        while(curr!=null){
            nxt = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nxt;
        }
        return prev;
    }
}