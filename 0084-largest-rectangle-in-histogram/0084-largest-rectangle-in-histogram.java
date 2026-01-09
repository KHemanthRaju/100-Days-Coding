class Solution {
    public int largestRectangleArea(int[] heights) {
        //Monotonic stock
        //two pointers
        int maxArea = 0;
        int n = heights.length;
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<=heights.length;i++){
            while(!st.isEmpty() && (i==n || heights[st.peek()]>=heights[i])){
                int height = heights[st.pop()];
                int width = st.isEmpty()?i : i - st.peek() - 1;
                maxArea = Math.max(maxArea, height*width);
            }
            st.add(i);
        }
        return maxArea;
    }
}