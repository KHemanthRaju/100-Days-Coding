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
        if(lists.length==0){
            return null;
        }
        if(lists.length==1){
            return lists[0];
        }
        ListNode newList = mergeTwoLists(lists[0], lists[1]);
        for(int i=2;i<lists.length;i++){
            newList = mergeTwoLists(newList, lists[i]);
        }
        return newList;
    }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2){
        ListNode ans = new ListNode(0);
        ListNode head = ans;
        while(list1!=null && list2!=null){
            if(list1.val<=list2.val){
                ans.next = list1;
                list1 = list1.next;
            }
            else{
                ans.next = list2;
                list2 = list2.next;
            }
            ans = ans.next;
        }
        while(list1!=null){
            ans.next = list1;
            ans=ans.next;
            list1 = list1.next;
        }

        while(list2!=null){
            ans.next = list2;
            ans = ans.next;
            list2 = list2.next;
        }
        return head.next;
    }
}