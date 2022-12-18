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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root==null){
            return false;
        }
        
        if(isIdentical(root,subRoot)){
            return true;
        }
        return isSubtree(root.left, subRoot) || isSubtree(root.right,subRoot);
    }
    
    private boolean isIdentical(TreeNode root1, TreeNode root2){
        if(root1 == null || root2 == null){
            return root1 == null && root2 == null;
        }
        
        return root1.val == root2.val && isIdentical(root1.left,root2.left) && isIdentical(root1.right, root2.right);
    }
}