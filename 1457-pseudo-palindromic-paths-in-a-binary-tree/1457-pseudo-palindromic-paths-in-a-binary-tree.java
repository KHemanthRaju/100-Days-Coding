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
    public int pseudoPalindromicPaths(TreeNode root) {
        return countPseudoPalindromicPaths(root, 0);
    }

    private int countPseudoPalindromicPaths(TreeNode node, int pathStatus) {
        if (node == null) {
            return 0;
        }

        // Update the path status based on the current node's value
        pathStatus ^= (1 << node.val);

        // If it's a leaf node, check if the path is pseudo-palindromic
        if (node.left == null && node.right == null) {
            // If pathStatus has at most one bit set to 1, it's pseudo-palindromic
            return (pathStatus & (pathStatus - 1)) == 0 ? 1 : 0;
        }

        // Recursive calls for left and right subtrees
        int leftCount = countPseudoPalindromicPaths(node.left, pathStatus);
        int rightCount = countPseudoPalindromicPaths(node.right, pathStatus);

        return leftCount + rightCount;
    }
}