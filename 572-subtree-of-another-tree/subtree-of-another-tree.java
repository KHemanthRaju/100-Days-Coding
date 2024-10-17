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
    
    public String preOrderTraversal(TreeNode root){
        if(root==null){
            return "null";
        }
        
        StringBuilder st = new StringBuilder("^");
        st.append(root.val);
        st.append(preOrderTraversal(root.left));
        st.append(preOrderTraversal(root.right));
        System.out.println(st);
            
        return st.toString();
    }
    
    
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        
        String fullTree = preOrderTraversal(root);
        String subTree = preOrderTraversal(subRoot);
        
        return fullTree.contains(subTree);
        
    }
}