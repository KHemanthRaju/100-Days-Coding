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
    TreeNode prev = null;
    int min = Integer.MAX_VALUE;
    public int minDiffInBST(TreeNode root) {
        //ProrityQueue and then difference between top two
        Inorder(root);
        return min;
        
    }
    
    public void Inorder(TreeNode root){
        if(root == null) return;
        Inorder(root.left);
        if(prev!=null){
            min = Math.min(min, root.val-prev.val);
        }
        prev = root;
        Inorder(root.right);
    }
}