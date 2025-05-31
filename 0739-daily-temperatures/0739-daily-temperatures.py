class Solution:
    def dailyTemperatures(self, temperatures: List[int]) -> List[int]:
        stack = [] #(temp,i)
        ans = [0] * len(temperatures)
        for i,t in enumerate(temperatures):
            while stack and t > stack[-1][0]:
                stackV, stackI = stack.pop()
                ans[stackI] = i - stackI
            stack.append((t,i))
        return ans