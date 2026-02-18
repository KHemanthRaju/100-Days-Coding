class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        minimum = prices[0]
        maximum = 0
        for i in range(len(prices)):
            minimum = min(minimum, prices[i])
            maximum = max(maximum, prices[i] - minimum)
        return maximum