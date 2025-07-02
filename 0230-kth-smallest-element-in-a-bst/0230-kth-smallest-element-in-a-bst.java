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
    public int kthSmallest(TreeNode root, int k) {
        ArrayList<Integer> ans = inOrder(root, new ArrayList<>());
        return ans.get(k-1);
    }

    public ArrayList inOrder(TreeNode root, ArrayList ans){
        if(root == null) return ans;
        inOrder(root.left, ans);
        ans.add(root.val);
        inOrder(root.right, ans);
        return ans;
    }
}