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
        List<List<Integer>> ans = new ArrayList<>();
        if(root==null){
            return new ArrayList<>();
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int len = queue.size();
            ArrayList<Integer> res = new ArrayList<>();
            for(int i=0;i<len;i++){
                TreeNode q = queue.poll();
                res.add(q.val);
                if(q.left!=null){
                    queue.add(q.left);
                }
                if(q.right!=null){
                    queue.add(q.right);
                }
            
            }
            ans.add(res);
        }
        
        return ans;
    }
}