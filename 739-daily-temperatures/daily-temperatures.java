class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        Stack<Integer> st = new Stack<>();
        int[] results = new int[n];

        for(int i=n-1;i>=0;i--){    
            int currentTemp = temperatures[i];
            while(!st.isEmpty() && currentTemp >= temperatures[st.peek()]){
                st.pop();
            }
            if(!st.isEmpty()){
                results[i] = st.peek() - i;
            }
            st.push(i);
        }
        return results;
    }
}