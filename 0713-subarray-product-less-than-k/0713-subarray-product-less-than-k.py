class Solution:
    def numSubarrayProductLessThanK(self, nums: List[int], k: int) -> int:
        if k<=1:
            return 0
        total_count = 0
        left = 0
        product = 1
        for right, num in enumerate(nums):
            product *= num
            while product >= k:
                product //= nums[left]
                left+=1
            total_count += right - left + 1
        return total_count