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
    public int rob(TreeNode root) {
        int[] options = travel(root);
        return Math.max(options[0],options[1]);
    }
    
    public int[] travel(TreeNode root){
        if(root == null){
            return new int[2];
        }
        int[] left_side_choices = travel(root.left);
        int[] right_side_choices = travel(root.right);
        int[] options = new int[2];
        
        options[0] = root.val+left_side_choices[1]+right_side_choices[1];
        
        options[1] = Math.max(left_side_choices[0],left_side_choices[1]) + Math.max(right_side_choices[0],right_side_choices[1]);
        
        return options;
    }
}