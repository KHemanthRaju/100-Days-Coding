class Solution:
    def maxProduct(self, nums: List[int]) -> int:
        prefix = 1
        suffix = 1
        n = len(nums)
        ans = nums[0]
        for i in range(n):
            if (prefix==0):
                prefix = 1
            if suffix == 0:
                suffix = 1

            prefix *= nums[i]
            suffix *= nums[n-1-i]
            ans = max(ans,prefix, suffix)
        return ans