class Solution:
    def minCostClimbingStairs(self, cost: List[int]) -> int:
        minimum = 'inf'
        n = len(cost)
        dp = ['inf']*(len(cost)+1)
        dp[0] = cost[0]
        dp[1] = cost[1]
        for i in range(2, len(cost)):
            dp[i] = min(dp[i-1]+cost[i], dp[i-2]+cost[i])
        return min(dp[n-1],dp[n-2])