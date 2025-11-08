class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        ans = {}
        for i,n in enumerate(nums):
            if target-n in ans:
                return [i, ans[target-n]]
            ans[n]=i