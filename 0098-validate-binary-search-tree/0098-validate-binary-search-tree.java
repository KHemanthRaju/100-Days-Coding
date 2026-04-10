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
        if(root==null) return false;
        ArrayList<Integer> ans = new ArrayList<>();
        inOrder(root, ans);
        int n = ans.size();
        boolean isBST = true;
        int prev = ans.get(0);
        for(int i=1;i<n;i++){
            if(prev>=ans.get(i)){
                isBST = false;
            }
            prev = ans.get(i);
        }
        return isBST;
    }

    public void inOrder(TreeNode root, ArrayList<Integer> ans){
        if(root==null) return;
        inOrder(root.left, ans);
        ans.add(root.val);
        inOrder(root.right, ans);
    }
}