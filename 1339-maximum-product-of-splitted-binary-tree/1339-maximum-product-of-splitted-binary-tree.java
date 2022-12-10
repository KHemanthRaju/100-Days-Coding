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
            long max = 0;
    long total;
    long mod = 1000000007;
    public int maxProduct(TreeNode root) {
        total = dfs(root);
        traverse(root);

        return (int)(max%mod);
    }
    
    public int dfs(TreeNode root){
        if(root == null){
            return 0;
        }
        return root.val += dfs(root.left)+dfs(root.right);
    }
    
    public void traverse(TreeNode root){
        if(root == null){
            return;
        }
        max = Math.max(max, root.val * (total-root.val));
        traverse(root.left);
        traverse(root.right);
    }
}