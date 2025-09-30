class Solution:
    def minimumOperations(self, nums: List[int]) -> int:
        count = 0
        while max(nums)!=0:
            count+=1
            ans = 100
            for num in nums:
                if num<ans and num!=0:
                    ans = num
            for i in range(len(nums)):
                nums[i] = nums[i] - ans if nums[i] != 0 else 0
            
        return count