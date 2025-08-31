class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        maxCurrent = nums[0]
        maxLength = nums[0]
        for i in range(1,len(nums)):
            maxCurrent = max(nums[i], maxCurrent+nums[i])
            maxLength = max(maxLength, maxCurrent)
        return maxLength