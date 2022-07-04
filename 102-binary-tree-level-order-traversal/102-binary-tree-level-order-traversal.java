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
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        
        if(root == null) return result;
        int curl = 0;
        
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        while(!queue.isEmpty()){
            List<Integer> res = new ArrayList<Integer>();
            curl = queue.size();
            for(int i=0;i<curl;i++){
                TreeNode peek = queue.poll();
                res.add(peek.val);
                if(peek.left!=null) queue.add(peek.left);
                if(peek.right!=null) queue.add(peek.right);
                
            }
            result.add(res);
        }
        return result;
    }
}