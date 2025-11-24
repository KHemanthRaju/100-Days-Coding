class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<int[]> st = new Stack<>();
        int[] ans = new int[temperatures.length];
        for(int i=0;i<temperatures.length;i++){
            while(!st.isEmpty() && temperatures[i]>st.peek()[1]){
                int[] temp = st.pop();
                ans[temp[0]] = i-temp[0];
            }
            st.push(new int[]{i,temperatures[i]});
        }
        return ans;
    }
}