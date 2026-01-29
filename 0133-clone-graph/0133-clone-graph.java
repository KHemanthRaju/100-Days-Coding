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
        Map<Node, Node> map = new HashMap<>();
        return clonnedGraph(map,node);

    }
    public Node clonnedGraph(Map<Node, Node> map, Node originalNode){
        if(map.containsKey(originalNode)){
            return map.get(originalNode);
        }
        Node cloneNode = new Node(originalNode.val);
        map.put(originalNode, cloneNode);
        for(Node neighbor: originalNode.neighbors){
            cloneNode.neighbors.add(clonnedGraph(map, neighbor));
        }
        return cloneNode;

    }
}