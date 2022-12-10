/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
        if(node == null) return null;
        Queue<Node> queue = new LinkedList<>();
        HashMap<Node,Node> map = new HashMap<>();
        map.put(node,new Node(node.val));
        queue.add(node);
        while(!queue.isEmpty()){
            Node current = queue.poll();
            for(Node ng : current.neighbors){
                if(!map.containsKey(ng)){
                    map.put(ng,new Node(ng.val));
                    queue.add(ng);
                }
                map.get(current).neighbors.add(map.get(ng));
            }
        }
        return map.get(node);
    }
}