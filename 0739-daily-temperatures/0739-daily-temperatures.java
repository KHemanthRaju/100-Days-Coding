class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<int[]> st = new Stack<>();
        int[] ans = new int[temperatures.length];
        for(int i=0;i<temperatures.length;i++){
            while(!st.isEmpty() && temperatures[i] > st.peek()[0]){
                int[] pair = st.pop();
                ans[pair[1]] = i - pair[1];
            }
            st.push(new int[]{temperatures[i],i});
        }
        return ans;
    }
}