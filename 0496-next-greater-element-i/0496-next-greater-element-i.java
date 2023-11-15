class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length];
        Stack<Integer> st = new Stack<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int num:nums2){
            while(!st.empty() && num > st.peek()){
                map.put(st.pop(),num);
            }
            st.push(num);
        }
        int i=0;
        for(int num:nums1){
            result[i++] = map.getOrDefault(num,-1);
        }
        return result;
    }
}