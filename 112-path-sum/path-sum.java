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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return helper(root, targetSum,0);
    }
    public boolean helper(TreeNode curr, int targetSum, int currSum){
        if(curr == null) return false;
        if(curr.left == null && curr.right == null){
        if(currSum + curr.val == targetSum){
            return true;
        }else{
            return false;
        }
        }
        boolean left = helper(curr.left, targetSum, currSum+ curr.val);
        boolean right = helper(curr.right, targetSum, currSum + curr.val);
        return left || right;
    }
}