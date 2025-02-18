class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int ans[] = new int[nums.length];
        int n = nums.length;
        Arrays.fill(ans,-1);
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<2*n;i++){
            while(!st.isEmpty() && nums[i%n]>nums[st.peek()]){
                ans[st.pop()%n]=nums[i%n];
            }
            st.push(i%n);
        }
        return ans;
    }
}