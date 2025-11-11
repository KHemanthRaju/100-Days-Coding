class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] ans = new int[temperatures.length];
        Stack<int[]> st = new Stack<>();
        for(int i=0;i<temperatures.length;i++){
            while(!st.isEmpty() && temperatures[i]>st.peek()[0]){
                int[] temp = st.pop();
                ans[temp[1]] = i - temp[1];
            }
            st.push(new int[]{temperatures[i],i});
        }
        return ans;
    }
}