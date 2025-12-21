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
    public boolean isValidBST(TreeNode root) {
        if(root==null){
            return true;
        }
        ArrayList<Integer> ans = new ArrayList<>();
        helper(root, ans);
        boolean isBST = true;
        int prev = ans.get(0);
        for(int i=1;i<ans.size();i++){
            if(ans.get(i)<=prev){
                isBST = false;
            }
            prev= ans.get(i);
        }
        return isBST;

    }

    public void helper(TreeNode root, ArrayList<Integer> ans){
        if(root==null) return;
        helper(root.left,ans);
        ans.add(root.val);
        helper(root.right, ans);
    }

}