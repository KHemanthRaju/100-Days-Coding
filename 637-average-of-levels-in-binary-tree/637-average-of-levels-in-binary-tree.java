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
    public List<Double> averageOfLevels(TreeNode root) {
        if(root==null) return new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        List<Double> result = new ArrayList<>();
        while(!queue.isEmpty()){
            int n = queue.size();
            double sum=0;
            int curr = queue.size();
            for(int i=0;i<curr;i++){
                TreeNode peek = queue.poll();
                sum+=peek.val;
                if(peek.left!=null) queue.add(peek.left);
                if(peek.right!=null) queue.add(peek.right);
            }
            result.add(sum/n);
        }
        return result;
    }
}