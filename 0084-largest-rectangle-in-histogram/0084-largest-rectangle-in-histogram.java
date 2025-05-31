class Solution {
    public int largestRectangleArea(int[] heights) {
        int largest = 0;
        int n = heights.length;
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<=n;i++){
            while(!st.isEmpty() && (i == n || heights[st.peek()] >= heights[i])){
                int height = heights[st.pop()];
                int width = st.isEmpty() ? i : i - st.peek() - 1;
                largest = Math.max(largest, height * width);
            }
            st.push(i);
        }
        return largest;
    }
}