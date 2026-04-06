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
    public List<Integer> rightSideView(TreeNode root) {
        if(root==null){
            return new ArrayList<>();
        }
        ArrayList<Integer> ans = new ArrayList<>();
        helper(root,0, ans);
        return ans;
    }

    public void helper(TreeNode root, int lvl, ArrayList<Integer> ans){
        if(root==null){
            return;
        }
        if(lvl == ans.size()){
            ans.add(root.val);
        }
        helper(root.right, lvl+1, ans);
        helper(root.left, lvl+1, ans);
    }
}