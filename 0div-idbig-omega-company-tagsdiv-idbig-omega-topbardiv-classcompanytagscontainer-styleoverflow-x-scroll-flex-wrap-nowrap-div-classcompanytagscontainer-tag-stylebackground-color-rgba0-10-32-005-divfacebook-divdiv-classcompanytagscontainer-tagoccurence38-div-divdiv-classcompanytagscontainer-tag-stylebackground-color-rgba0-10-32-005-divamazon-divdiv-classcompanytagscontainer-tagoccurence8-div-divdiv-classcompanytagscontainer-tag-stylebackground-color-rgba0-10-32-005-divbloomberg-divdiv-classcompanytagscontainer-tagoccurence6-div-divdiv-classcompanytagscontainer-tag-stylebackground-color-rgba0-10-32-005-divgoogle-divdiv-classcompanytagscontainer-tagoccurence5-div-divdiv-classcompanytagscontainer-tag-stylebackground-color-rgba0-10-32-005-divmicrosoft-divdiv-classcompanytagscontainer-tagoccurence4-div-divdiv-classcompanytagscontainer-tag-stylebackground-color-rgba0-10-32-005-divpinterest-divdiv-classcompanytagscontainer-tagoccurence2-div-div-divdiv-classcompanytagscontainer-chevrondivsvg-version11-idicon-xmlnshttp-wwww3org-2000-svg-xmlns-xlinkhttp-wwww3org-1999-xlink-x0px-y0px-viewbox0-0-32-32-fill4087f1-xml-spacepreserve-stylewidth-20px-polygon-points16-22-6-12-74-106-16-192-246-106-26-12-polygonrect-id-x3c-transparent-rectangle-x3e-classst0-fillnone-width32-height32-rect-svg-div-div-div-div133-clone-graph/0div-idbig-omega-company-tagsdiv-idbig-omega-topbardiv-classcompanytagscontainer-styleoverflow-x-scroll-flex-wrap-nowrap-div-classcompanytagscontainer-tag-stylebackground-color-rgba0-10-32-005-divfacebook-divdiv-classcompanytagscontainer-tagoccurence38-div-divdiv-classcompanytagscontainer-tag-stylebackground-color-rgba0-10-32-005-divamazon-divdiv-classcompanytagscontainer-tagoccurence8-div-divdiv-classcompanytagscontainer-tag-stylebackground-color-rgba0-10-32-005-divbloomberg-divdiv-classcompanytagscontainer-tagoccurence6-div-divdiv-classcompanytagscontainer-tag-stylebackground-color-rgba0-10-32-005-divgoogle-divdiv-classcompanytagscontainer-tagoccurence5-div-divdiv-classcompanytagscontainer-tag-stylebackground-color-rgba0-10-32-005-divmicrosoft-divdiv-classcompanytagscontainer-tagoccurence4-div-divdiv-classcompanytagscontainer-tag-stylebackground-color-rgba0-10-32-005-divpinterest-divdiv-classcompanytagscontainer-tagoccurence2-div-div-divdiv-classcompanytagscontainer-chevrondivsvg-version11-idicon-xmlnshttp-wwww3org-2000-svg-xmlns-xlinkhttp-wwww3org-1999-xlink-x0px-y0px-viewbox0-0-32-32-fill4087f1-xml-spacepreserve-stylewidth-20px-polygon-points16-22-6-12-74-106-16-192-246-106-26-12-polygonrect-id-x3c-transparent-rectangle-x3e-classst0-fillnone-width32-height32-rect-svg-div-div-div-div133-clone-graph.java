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
        Map<Node,Node> cloneMap = new HashMap<>();
        return cloneNode(node, cloneMap);
    }
     public Node cloneNode(Node original, Map<Node,Node> cloneMap){
         if(cloneMap.containsKey(original)){
             return cloneMap.get(original);
         }
         
         Node clone = new Node(original.val);
         cloneMap.put(original, clone);
         
         for(Node neighbor:original.neighbors){
             clone.neighbors.add(cloneNode(neighbor, cloneMap));
         }
         
         return clone;
     }
    
    
    
}