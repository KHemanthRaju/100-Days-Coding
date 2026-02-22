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
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        int count = 0;
        while(fast.next!=null){
            count+=1;
            fast = fast.next;
        }
        if(count%2==0){
            for(int i=0;i<count/2;i++){
                slow = slow.next;
            }
        }else{
            for(int i=0;i<=count/2;i++){
                slow= slow.next;
            }
        }
        ListNode ans = slow;
        return ans;
    }
}