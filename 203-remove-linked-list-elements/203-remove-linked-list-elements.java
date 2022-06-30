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
   public ListNode removeElements(ListNode head, int val) {
       ListNode fake = new ListNode(-1);
       fake.next = head;
       ListNode prev = fake;
       ListNode curr = head;
       while(curr!=null){
           if(curr.val == val){
               prev.next = curr.next;
               
           }else{
               prev = prev.next;
               
           }
           curr = curr.next;
       }
       return fake.next;
    }
}