/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nextLargerNodes(ListNode node) {
        Stack<Integer> st = new Stack<>();
        List<Integer> ans = new ArrayList<>();
        while(node!=null){
            ans.add(node.val);
            node = node.next;
        }
        int[] out = new int[ans.size()];
        st.push(0);
        for(int i=1;i<ans.size();i++){
            int value = ans.get(i);
            if(st.isEmpty() && value < ans.get(st.peek())){
                st.push(i);
            }else{
                while(!st.isEmpty() && value > ans.get(st.peek())){
                    out[st.pop()] = value;
                }
                st.push(i);
            }
        }
        return out;
    }
}