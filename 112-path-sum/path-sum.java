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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null) return false;
        Stack<TreeNode> st = new Stack<>();
        st.push(root);
        while(!st.isEmpty()){
            int leafNode = 0;
            TreeNode popNode = st.pop();
            
            if(popNode.left!=null){
                popNode.left.val += popNode.val;
                st.push(popNode.left);
                leafNode=1;
            }
            
            if(popNode.right!=null){
                popNode.right.val += popNode.val;
                st.push(popNode.right);
                leafNode=1;
            }
            
            if(leafNode==0){
                if(popNode.val==targetSum){
                    return true;
                }
            }
        }
        
        return false;
    }
}