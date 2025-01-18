class Solution {
    public int largestRectangleArea(int[] heights) {
        int maxArea = 0;
        Stack<Integer> st = new Stack<>();
        int n = heights.length;

        for(int i=0;i<=n;i++){
            int currentHeight = (i==n) ? 0:heights[i];
            while(!st.isEmpty() && currentHeight<heights[st.peek()]){
                int height = heights[st.pop()];
                int width = st.isEmpty() ? i : i - st.peek() - 1;
                maxArea = Math.max(maxArea, height * width);
            }
            st.push(i);
        }
        return maxArea;
    }
}