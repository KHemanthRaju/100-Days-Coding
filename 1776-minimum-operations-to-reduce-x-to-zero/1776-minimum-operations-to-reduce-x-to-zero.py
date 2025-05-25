class Solution:
    def minOperations(self, nums: List[int], x: int) -> int:
        total_sum = sum(nums)
        target = total_sum - x
        left = 0

        max_len= -1
        curr_sum = 0
        for right in range(len(nums)):
            curr_sum += nums[right]
            while curr_sum > target and left <= right:
                curr_sum -= nums[left]
                left+=1
            if curr_sum == target:
                max_len = max(max_len, right - left + 1)
        
        return len(nums) - max_len if max_len!=-1 else -1