class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map = new HashMap<>();
        Stack<Integer> st = new Stack<>();
        for(int num:nums2){
            while(!st.isEmpty() && num>st.peek()){
                map.put(st.pop(),num);
            }
            st.push(num);
        }
        int i=0;
        int ans[] = new int[nums1.length];
        for(int n:nums1){
            ans[i] = map.getOrDefault(n,-1);
            i++;
        }
        return ans;
    }
}