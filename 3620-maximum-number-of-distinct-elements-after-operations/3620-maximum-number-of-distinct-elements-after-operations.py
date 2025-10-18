class Solution:
    def maxDistinctElements(self, nums: List[int], k: int) -> int:
        nums.sort()
        prev = float('-inf')
        count=0
        for i in range(len(nums)):
            if prev < nums[i]-k:
                count+=1
                prev = nums[i]-k
            elif prev < nums[i]+k:
                count+=1
                prev = prev+1
        return count