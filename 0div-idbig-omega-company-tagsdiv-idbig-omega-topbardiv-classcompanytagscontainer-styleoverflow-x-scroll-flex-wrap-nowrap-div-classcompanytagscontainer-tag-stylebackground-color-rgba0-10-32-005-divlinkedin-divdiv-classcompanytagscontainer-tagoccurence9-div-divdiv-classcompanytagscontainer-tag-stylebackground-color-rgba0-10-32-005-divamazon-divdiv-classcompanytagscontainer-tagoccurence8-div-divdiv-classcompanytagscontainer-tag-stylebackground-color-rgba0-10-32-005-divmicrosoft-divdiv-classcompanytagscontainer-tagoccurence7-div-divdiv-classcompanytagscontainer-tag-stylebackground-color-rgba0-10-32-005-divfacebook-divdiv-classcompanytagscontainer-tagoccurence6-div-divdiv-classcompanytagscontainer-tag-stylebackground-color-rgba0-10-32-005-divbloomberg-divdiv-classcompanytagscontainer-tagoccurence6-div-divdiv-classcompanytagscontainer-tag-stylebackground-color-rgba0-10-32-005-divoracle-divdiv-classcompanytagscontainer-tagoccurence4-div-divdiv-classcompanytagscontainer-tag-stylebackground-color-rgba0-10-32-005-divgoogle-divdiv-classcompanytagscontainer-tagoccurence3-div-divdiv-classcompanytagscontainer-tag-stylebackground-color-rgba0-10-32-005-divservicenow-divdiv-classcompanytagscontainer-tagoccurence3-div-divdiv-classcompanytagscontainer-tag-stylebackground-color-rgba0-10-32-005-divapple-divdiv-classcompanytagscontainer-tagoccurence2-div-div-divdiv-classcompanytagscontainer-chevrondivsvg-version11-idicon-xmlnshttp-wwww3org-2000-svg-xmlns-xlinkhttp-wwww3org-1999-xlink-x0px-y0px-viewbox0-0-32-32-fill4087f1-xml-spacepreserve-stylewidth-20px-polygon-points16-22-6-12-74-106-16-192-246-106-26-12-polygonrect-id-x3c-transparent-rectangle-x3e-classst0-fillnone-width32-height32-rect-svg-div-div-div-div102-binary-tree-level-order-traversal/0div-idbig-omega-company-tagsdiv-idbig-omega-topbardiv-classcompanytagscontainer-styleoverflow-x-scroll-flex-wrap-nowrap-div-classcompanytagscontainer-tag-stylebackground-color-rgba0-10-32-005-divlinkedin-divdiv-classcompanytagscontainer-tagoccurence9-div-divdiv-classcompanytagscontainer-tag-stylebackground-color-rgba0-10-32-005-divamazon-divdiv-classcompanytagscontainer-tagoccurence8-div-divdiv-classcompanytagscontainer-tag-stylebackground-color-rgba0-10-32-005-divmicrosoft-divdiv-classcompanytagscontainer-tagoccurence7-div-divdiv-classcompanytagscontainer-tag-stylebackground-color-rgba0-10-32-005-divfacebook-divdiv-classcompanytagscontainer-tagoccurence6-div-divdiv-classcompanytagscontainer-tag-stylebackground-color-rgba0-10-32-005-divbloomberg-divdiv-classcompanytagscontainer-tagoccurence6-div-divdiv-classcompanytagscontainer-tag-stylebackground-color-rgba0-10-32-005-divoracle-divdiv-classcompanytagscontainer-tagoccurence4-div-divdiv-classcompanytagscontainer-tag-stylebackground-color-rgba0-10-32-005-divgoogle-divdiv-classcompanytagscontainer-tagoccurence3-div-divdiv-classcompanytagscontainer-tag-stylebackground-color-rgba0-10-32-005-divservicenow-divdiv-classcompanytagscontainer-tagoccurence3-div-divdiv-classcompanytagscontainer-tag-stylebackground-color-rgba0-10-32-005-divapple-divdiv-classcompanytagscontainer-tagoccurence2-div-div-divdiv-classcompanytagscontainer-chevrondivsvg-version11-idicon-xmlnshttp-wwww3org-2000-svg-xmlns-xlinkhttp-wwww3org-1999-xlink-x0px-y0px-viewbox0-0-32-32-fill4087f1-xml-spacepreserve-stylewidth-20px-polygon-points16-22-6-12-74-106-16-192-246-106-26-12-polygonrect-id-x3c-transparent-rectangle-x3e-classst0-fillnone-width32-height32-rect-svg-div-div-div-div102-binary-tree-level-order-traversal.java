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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root==null) return result;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(queue.size()!=0){
            int curr = queue.size();
            List<Integer> ans = new ArrayList<>();
            for(int i=0;i<curr;i++){
                TreeNode q1 = queue.poll();
                ans.add(q1.val);
                if(q1.left!=null) queue.add(q1.left);
                if(q1.right!=null) queue.add(q1.right);
            }
            
            result.add(ans);
        }
        return result;
    }
}