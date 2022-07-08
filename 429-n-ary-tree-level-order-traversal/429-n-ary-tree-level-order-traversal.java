/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root==null){
            return ans;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        
        while(!queue.isEmpty()){
            List<Integer> res = new ArrayList<>();
            int size=queue.size();
            for(int i=0;i<size;i++){
                Node q1 = queue.poll();
                res.add(q1.val);
                queue.addAll(q1.children);
            }
            ans.add(res);
        }
        return ans;
    }
}