class Solution:
    def lengthOfLIS(self, nums: List[int]) -> int:
        dp = [1] * len(nums)
        for i in range(len(nums)):
            for j in range(0,i):
                if nums[i]>nums[j]:
                    dp[i] = max(dp[i], 1+dp[j])
        return max(dp)