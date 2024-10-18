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
    public boolean isPalindrome(ListNode head) {
        List<Integer> ans = new ArrayList<>();
        while(head!=null){
            ans.add(head.val);
            head = head.next;
        }
        
        int n = ans.size();
        int[] newArray = new int[n+1];
        for(int i=0;i<n;i++){
            newArray[i] = ans.get(i);
        }
        
        int left = 0;
        int right = n-1;
        while(left<=right){
            if(newArray[left]!=newArray[right]){
                return false;
            }
            left++;
            right--;
        }
        
        return true;
    }
}