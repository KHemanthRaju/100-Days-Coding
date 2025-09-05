class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        minAmount = prices[0]
        maxProfit = 0
        for i in range(len(prices)):
            minAmount = min(minAmount, prices[i])
            maxProfit = max(maxProfit, prices[i]-minAmount)
        return maxProfit