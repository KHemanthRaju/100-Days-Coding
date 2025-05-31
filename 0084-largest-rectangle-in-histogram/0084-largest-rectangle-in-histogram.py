class Solution:
    def largestRectangleArea(self, heights: List[int]) -> int:
        maxArea = 0
        st = []
        n = len(heights)
        for i in range(n+1):
            while st and (i==n or heights[st[-1]] > heights[i]):
                height = heights[st.pop()]
                width = i if not st else i - st[-1] - 1
                maxArea = max(maxArea, height * width)
            st.append(i)
        return maxArea