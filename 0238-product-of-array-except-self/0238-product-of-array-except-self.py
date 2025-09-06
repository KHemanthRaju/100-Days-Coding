class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        n = len(nums)
        output = [1] * n

        left_prod = 1
        for i in range(n):
            output[i] = left_prod
            left_prod *= nums[i]
        
        right_prod = 1
        for i in range(n-1,-1,-1):
            output[i] *= right_prod
            right_prod *= nums[i]
        return output