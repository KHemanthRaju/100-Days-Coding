class Solution:
    def permute(self, nums: List[int]) -> List[List[int]]:
        res = []

        def dfs(path, remaining):
            if not remaining:
                res.append(path[:])
                return
            for i in range(len(remaining)):
                dfs(path+[remaining[i]], remaining[:i]+remaining[i+1:])
        dfs([], nums)
        return res