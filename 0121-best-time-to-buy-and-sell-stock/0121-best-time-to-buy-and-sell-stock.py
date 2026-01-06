class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        ans = 0
        minAmount = max(prices)
        for price in prices:
            ans = max(ans, price - minAmount)
            if price < minAmount:
                minAmount = price
        return ans