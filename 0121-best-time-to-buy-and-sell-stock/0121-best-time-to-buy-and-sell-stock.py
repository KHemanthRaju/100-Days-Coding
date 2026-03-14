class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        minAmount = prices[0]
        maxAmount = 0
        for price in prices:
            minAmount = min(minAmount, price)
            maxAmount = max(maxAmount, price-minAmount)
        return maxAmount