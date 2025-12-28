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
        if(node==null) return null;
        Map<Node, Node> map = new HashMap<>();
        return clonedGraph(node, map);
    }

    public Node clonedGraph(Node originalNode, Map<Node, Node> map){
        if(map.containsKey(originalNode)){
            return map.get(originalNode);
        }
        Node clonedNode = new Node(originalNode.val);
        map.put(originalNode, clonedNode);
        for(Node neighbor:originalNode.neighbors){
            clonedNode.neighbors.add(clonedGraph(neighbor, map));
        }
        return clonedNode;
    }
}