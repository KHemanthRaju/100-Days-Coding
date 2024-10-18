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
    public ListNode sortList(ListNode head) {
        if(head==null) return null;
        
        ArrayList<Integer> ans = new ArrayList<>();
        while(head!=null){
            ans.add(head.val);
            head = head.next;
        }
        
        Collections.sort(ans);
        ListNode dummy = new ListNode(0);
        ListNode dummy2 = dummy;
        for(int i=0;i<ans.size();i++){
            ListNode newList = new ListNode(ans.get(i));
            dummy.next = newList;
            dummy = dummy.next;
        }
        
        return dummy2.next;
    }
}