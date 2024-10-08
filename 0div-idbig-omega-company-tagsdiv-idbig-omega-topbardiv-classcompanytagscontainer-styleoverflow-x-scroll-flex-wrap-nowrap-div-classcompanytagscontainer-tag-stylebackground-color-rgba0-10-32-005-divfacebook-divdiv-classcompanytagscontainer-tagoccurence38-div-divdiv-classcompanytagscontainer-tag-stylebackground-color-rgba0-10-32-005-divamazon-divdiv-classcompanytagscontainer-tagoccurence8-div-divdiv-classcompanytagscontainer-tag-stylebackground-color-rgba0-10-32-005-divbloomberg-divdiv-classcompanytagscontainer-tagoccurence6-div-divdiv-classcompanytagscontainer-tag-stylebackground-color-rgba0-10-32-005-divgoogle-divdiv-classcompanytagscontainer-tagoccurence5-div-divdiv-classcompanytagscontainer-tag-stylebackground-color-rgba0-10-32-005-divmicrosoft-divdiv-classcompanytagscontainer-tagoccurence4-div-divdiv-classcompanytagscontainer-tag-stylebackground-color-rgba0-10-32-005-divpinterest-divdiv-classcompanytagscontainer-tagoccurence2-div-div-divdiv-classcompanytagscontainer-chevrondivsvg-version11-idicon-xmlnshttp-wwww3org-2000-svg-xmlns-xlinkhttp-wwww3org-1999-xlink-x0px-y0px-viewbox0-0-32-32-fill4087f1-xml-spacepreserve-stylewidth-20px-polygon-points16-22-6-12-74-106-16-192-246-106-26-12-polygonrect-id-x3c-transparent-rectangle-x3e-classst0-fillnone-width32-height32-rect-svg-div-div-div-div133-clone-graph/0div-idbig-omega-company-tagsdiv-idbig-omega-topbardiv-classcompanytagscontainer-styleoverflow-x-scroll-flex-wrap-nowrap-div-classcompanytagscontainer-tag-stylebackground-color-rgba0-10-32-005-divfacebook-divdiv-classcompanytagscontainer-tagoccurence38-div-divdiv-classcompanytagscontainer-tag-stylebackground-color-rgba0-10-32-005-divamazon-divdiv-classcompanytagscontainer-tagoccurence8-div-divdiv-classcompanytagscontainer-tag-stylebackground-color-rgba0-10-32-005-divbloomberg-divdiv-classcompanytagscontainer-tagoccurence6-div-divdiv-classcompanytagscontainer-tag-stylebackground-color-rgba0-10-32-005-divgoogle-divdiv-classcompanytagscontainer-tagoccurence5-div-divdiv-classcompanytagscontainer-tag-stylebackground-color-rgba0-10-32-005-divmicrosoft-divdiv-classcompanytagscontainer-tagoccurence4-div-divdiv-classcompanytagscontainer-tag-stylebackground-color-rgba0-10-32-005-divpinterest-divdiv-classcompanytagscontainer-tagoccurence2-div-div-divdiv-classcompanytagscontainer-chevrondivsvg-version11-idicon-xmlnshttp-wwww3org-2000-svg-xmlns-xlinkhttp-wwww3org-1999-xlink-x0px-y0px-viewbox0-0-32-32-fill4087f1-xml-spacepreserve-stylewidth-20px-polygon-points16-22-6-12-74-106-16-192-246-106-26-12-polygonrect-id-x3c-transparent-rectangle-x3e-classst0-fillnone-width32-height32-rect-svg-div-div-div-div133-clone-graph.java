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
        return clone(node, map);
    }
    
    public Node clone(Node original, Map<Node, Node> cloneMap){
        
        if(cloneMap.containsKey(original)){
            return cloneMap.get(original);
        }
        
        Node cloneNode = new Node(original.val);
        cloneMap.put(original, cloneNode);
        
        for(Node neighbor:original.neighbors){
            cloneNode.neighbors.add(clone(neighbor,cloneMap));
        }
        
        return cloneNode;
    }
}