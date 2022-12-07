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
    public int rangeSumBST(TreeNode root, int low, int high) {
        Stack<TreeNode> st = new Stack<>();
        st.push(root);
        int sum = 0;
        while(!st.isEmpty()){
            TreeNode node = st.pop();
            if(node != null){
                if(node.val > low){
                    st.push(node.left);
                }if(node.val < high){
                    st.push(node.right);
                }
                if(node.val>=low && node.val <=high){
                    sum+=node.val;
                }
            }
            
        }
        return sum;
    }
}