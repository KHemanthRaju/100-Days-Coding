class Solution:
    def minCostClimbingStairs(self, cost: List[int]) -> int:
        n = len(cost)
        if n == 0:
            return 0
        if n==1:
            return cost[0]
        dp = [0] * (n+1)
        for i in range(2, n+1):
            dp[i] = min(cost[i-1]+dp[i-1], dp[i-2]+cost[i-2])
        return dp[-1]