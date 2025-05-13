class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        maps = {}
        for i in range(len(nums)):
            if target - nums[i] in maps:
                return [maps[target-nums[i]],i]
            maps[nums[i]] = i
        return 0