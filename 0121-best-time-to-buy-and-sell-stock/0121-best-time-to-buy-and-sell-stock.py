class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        maxN = 0
        minValue = prices[0]
        for i in range(1, len(prices)):
            minValue = min(minValue, prices[i])
            maxN = max(maxN, prices[i]-minValue)
        return maxN