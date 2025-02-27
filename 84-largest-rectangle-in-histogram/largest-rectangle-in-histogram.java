class Solution {
    public int largestRectangleArea(int[] heights) {
        int maxArea = 0;
        Stack<Integer> st = new Stack<>();
        int n = heights.length;
        for(int i=0;i<=heights.length;i++){
            int currTemp = (i==n)?0:heights[i];
            while(!st.isEmpty() && currTemp < heights[st.peek()]){
                int height = heights[st.pop()];
                int width = st.isEmpty() ? i : i - st.peek() - 1;
                maxArea = Math.max(maxArea, width * height);
            }
            st.push(i);
        }

        return maxArea;
    }
}