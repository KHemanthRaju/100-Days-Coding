/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        HashMap<Node, Node> oldToCopy = new HashMap<>();
        oldToCopy.put(null,null);

        Node curr = head;
        while(curr!=null){
            if(!oldToCopy.containsKey(curr)){
                oldToCopy.put(curr, new Node(0));
            }
            oldToCopy.get(curr).val = curr.val;

            if(!oldToCopy.containsKey(curr.next)){
                oldToCopy.put(curr.next, new Node(0));
            }
            oldToCopy.get(curr).next = oldToCopy.get(curr.next);

            if(!oldToCopy.containsKey(curr.random)){
                oldToCopy.put(curr.random, new Node(0));
            }
            oldToCopy.get(curr).random = oldToCopy.get(curr.random);
            curr = curr.next;
        }
        return oldToCopy.get(head);
    }
}