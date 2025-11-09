class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        min_value = float('inf')
        ans = 0
        for i in range(len(prices)):
            min_value = min(min_value, prices[i])
            ans = max(ans, prices[i]-min_value)
        return ans