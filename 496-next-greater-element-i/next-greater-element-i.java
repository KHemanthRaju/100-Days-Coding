class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st = new Stack<>();
        Map<Integer,Integer> map = new HashMap<>();

        for(int num:nums2){

            while(!st.isEmpty() && num>st.peek()){
                map.put(st.pop(),num);
            }
            st.push(num);
        }
        int i = 0;
        int[] ans = new int[nums1.length];
        for(int num:nums1){
            ans[i++] = map.getOrDefault(num,-1);
        }

        return ans;

    }
}