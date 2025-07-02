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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        Stack<TreeNode[]> st = new Stack<>();
        st.push(new TreeNode[]{p,q});

        while(!st.isEmpty()){
            TreeNode[] nodes = st.pop();
            TreeNode s1 = nodes[0], s2 = nodes[1];
            if(s1==null && s2 == null) continue;
            if(s1 == null || s2 == null || s1.val != s2.val) return false;

            st.push(new TreeNode[]{s1.left, s2.left});
            st.push(new TreeNode[]{s1.right, s2.right});
        }

        return true;
    }
}