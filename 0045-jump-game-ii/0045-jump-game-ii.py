class Solution:
    def jump(self, nums: List[int]) -> int:
        farthest = 0
        end = 0
        count=0
        for i in range(len(nums)-1):
            farthest = max(farthest, nums[i]+i)
            if i==end:
                count+=1
                end = farthest
        return count