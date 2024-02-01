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
    int count=0;
    public int goodNodes(TreeNode root) {
        count = 0;
        helper(root, Integer.MIN_VALUE);
        return count;
    }
    
    public void helper(TreeNode root, int max){
        if(root==null) return;
        if(root.val>=max) count++;
        max = Math.max(max,root.val);
        helper(root.left,max);
        helper(root.right,max);
        
    }
}