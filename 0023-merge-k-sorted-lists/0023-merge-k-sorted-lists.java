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
        if(lists.length==1){
            return lists[0];
        }
        if(lists.length==0){
            return null;
        }
        ListNode head = mergeTwoLists(lists[0],lists[1]);
        for(int i=2;i<lists.length;i++){
            head = mergeTwoLists(head,lists[i]);
        }
        return head;
        
    }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2){
        ListNode head = new ListNode(0);
        ListNode ans = head;
        while(list1!=null && list2!=null){
            if(list1.val < list2.val){
                head.next = list1;
                head = head.next;
                list1 = list1.next;
            }else{
                head.next = list2;
                head = head.next;
                list2 = list2.next;
            }
        }
        if(list1 == null){
            head.next = list2;
        }
        if(list2 == null){
            head.next = list1;
        }
        return ans.next;
    }
}