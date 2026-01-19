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
        if(root==null) return 0;
        ArrayList<Integer> ans = helper(root, new ArrayList<Integer>());
        return ans.get(k-1);
    }

    public ArrayList<Integer> helper(TreeNode root, ArrayList<Integer> ans){
        if(root==null) return ans;
        helper(root.left, ans);
        ans.add(root.val);
        helper(root.right, ans);
        return ans;
    }
}