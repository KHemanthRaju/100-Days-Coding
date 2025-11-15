class Solution:
    def permute(self, nums: List[int]) -> List[List[int]]:
        result = []
        used =[False] * len(nums)
        def backtrack(path):
            if len(nums) == len(path):
                result.append(path[:])
                return
            for i in range(len(nums)):
                if used[i] == False:
                    used[i] = True
                    path.append(nums[i])
                    backtrack(path)
                    path.pop()
                    used[i] = False
        backtrack([])
        return result