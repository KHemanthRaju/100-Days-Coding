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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue<TreeNode> q =new LinkedList<>();
        List<List<Integer>> list = new ArrayList<>();
        q.add(root);
        if(root == null) return list;

        while(!q.isEmpty()){
            List<Integer> ans = new ArrayList<>();
             int size = q.size();
             for(int i=0;i<size;i++){
              TreeNode present = q.poll();
              ans.add(present.val);
            //    if(i%2 !=0) Collections.reverse(ans);
              if(present.left != null) q.add(present.left);
              if(present.right != null) q.add(present.right);
              
             }
             list.add(ans);
        }
        for(int i=0;i<list.size();i++){
            if(i%2!=0) Collections.reverse(list.get(i));
        }
        return list;
    }
}