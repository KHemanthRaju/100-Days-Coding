class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        map = {}
        for i,num in enumerate(nums):
            complement = target - num
            if complement in map:
                return [i, map[complement]]
            map[num]= i
        return [0,0]