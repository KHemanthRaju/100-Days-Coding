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
    public int sumNumbers(TreeNode root) {
        return helper(root,"");
    }
    public int helper(TreeNode curr, String s){
        if(curr == null) return 0;
        if(curr.left == null && curr.right == null){
            return Integer.parseInt(s+curr.val);
        }
        int left = helper(curr.left,s+curr.val);
        int right = helper(curr.right,s+curr.val);
        return left+right;
    }
}