class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        left = [1] * len(nums)
        right = [1] * len(nums)
        ans = [1] * len(nums)

        for i in range(1, len(nums)):
            left[i] = left[i-1] * nums[i-1]
        for i in range(len(nums)-2,-1,-1):
            right[i] = right[i+1] * nums[i+1]
        for i in range(0, len(nums)):
            ans[i] = left[i] * right[i]
        return ans