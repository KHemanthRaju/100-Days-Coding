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
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        if(head == null) return null;

        if(head.next == null) return new TreeNode(head.val);


        ListNode slow_prev = null;
        ListNode slow = head;
        ListNode fast = head;
            
        while(fast != null && fast.next  != null){
            slow_prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        //slow node mid ko point kr rha hoga pakka
        TreeNode root = new TreeNode(slow.val);

        slow_prev.next = null;

        root.left = sortedListToBST(head);

        root.right = sortedListToBST(slow.next);

        return root;
    }
}