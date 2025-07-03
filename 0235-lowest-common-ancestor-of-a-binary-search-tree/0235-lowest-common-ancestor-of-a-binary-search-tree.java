/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode curr = root;
        return lca(curr, p, q);
    }

    public TreeNode lca(TreeNode curr, TreeNode p, TreeNode q){
        if(p.val < curr.val && q.val < curr.val) return lca(curr.left, p, q);
        if(p.val > curr.val && q.val > curr.val) return lca(curr.right, p, q);
        return curr;
    }
}