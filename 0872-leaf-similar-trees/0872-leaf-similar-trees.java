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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> first = new ArrayList<>();
        ArrayList<Integer> second = new ArrayList<>();
        dfs(root1,first);
        dfs(root2,second);
        return first.equals(second);
    }
    
    public void dfs(TreeNode root,ArrayList<Integer> leafs){
        if(root == null){
            return;
        }
        if(root.left == null && root.right==null){
            leafs.add(root.val);
        }
        dfs(root.right,leafs);
        dfs(root.left,leafs);
    }
}