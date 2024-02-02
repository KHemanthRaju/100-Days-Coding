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
    public int maxLevelSum(TreeNode root) {
        int max = Integer.MIN_VALUE, maxlevel=1;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        for(int level=1;!queue.isEmpty();level++){
            int sum = 0;
            for(int sz=queue.size();sz>0;sz--){
                TreeNode n = queue.poll();
                sum += n.val;
                if(n.left!=null){
                    queue.offer(n.left);
                }
                if(n.right!=null){
                    queue.offer(n.right);
                }
            }
            if(max<sum){
                max = sum;
                maxlevel = level;
            }
        }
        return maxlevel;
    }
}