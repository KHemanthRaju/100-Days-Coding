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
    int sum=0;
    public int sumOfLeftLeaves(TreeNode root) {
        helper(root);
        return sum;
    }
    
    public void helper(TreeNode root){
        if(root == null) return;
        if(root.left != null && root.left.left == null && root.left.right == null) sum += root.left.val;
        helper(root.left);
        helper(root.right);
        
    }
}