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
        Queue<TreeNode> q1 = new LinkedList<>();
        q1.add(root);
        while(!q1.isEmpty()){
            List<Integer> ans = new ArrayList<>();
            int curr = q1.size();
            for(int i=0;i<curr;i++){
                TreeNode peek = q1.poll();
                ans.add(peek.val);
                if(peek.left!=null) q1.add(peek.left);
                if(peek.right!=null) q1.add(peek.right);
            }
            result.add(ans);
        }
        return result;
    }
}