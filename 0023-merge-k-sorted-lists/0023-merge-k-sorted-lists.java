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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0){
            return null;
        }
        if(lists.length == 1){
            return lists[0];
        }
        ListNode newList = mergeTwoLinkedLists(lists[0],lists[1]);
        for(int i=2;i<lists.length;i++){
            newList = mergeTwoLinkedLists(newList, lists[i]);
        }

        return newList;
    }

    public ListNode mergeTwoLinkedLists(ListNode l1, ListNode l2){
        ListNode ans = new ListNode(0);
        ListNode head = ans;
        while(l1!=null && l2!=null){
            if(l1.val<l2.val){
                ans.next = l1;
                l1 = l1.next;
            }else{
                ans.next = l2;
                l2 = l2.next;
            }
            ans = ans.next;
        }

        while(l1!=null){
            ans.next = l1;
            l1 = l1.next;
            ans = ans.next;
        }

        while(l2!=null){
            ans.next = l2;
            l2 = l2.next;
            ans = ans.next;
        }

        return head.next;
    }
}