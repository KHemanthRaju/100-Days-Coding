class Solution:
    def coinChange(self, coins: List[int], amount: int) -> int:
        if amount < 1:
            return 0
        dp = [float('inf')] * (amount+1)
        dp[0] = 0
        for i in range(amount+1):
            for coin in coins:
                if i-coin>=0:
                    dp[i] = min(dp[i], 1+dp[i-coin])
        if dp[amount]==float('inf'):
            return -1
        return dp[amount]