class Solution {
    public int largestRectangleArea(int[] heights) {
        int longest = 0;
        Stack<Integer> st = new Stack<>();
        int n = heights.length;
        for(int i=0;i<=heights.length;i++){
            while(!st.isEmpty() && (i==n || heights[st.peek()] >= heights[i])){
                int height = heights[st.pop()];
                int width = st.isEmpty()? i : i-st.peek()-1;
                longest = Math.max(longest, height*width);
            }
            st.push(i);
        }
        return longest;
    }
}