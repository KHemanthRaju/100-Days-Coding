class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> st = new Stack<>();
        int n = temperatures.length;
        int[] ans = new int[n];
        for(int i=n-1;i>=0;i--){
            int currentTemp = temperatures[i];
            while(!st.isEmpty() && currentTemp>=temperatures[st.peek()]){
                st.pop();
            }
            if(!st.isEmpty()){
                ans[i] = st.peek()-i;
            }
            st.push(i);
        }

        return ans;
    }
}