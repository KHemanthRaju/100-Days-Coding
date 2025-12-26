class Solution:
    def combinationSum(self, candidates: List[int], target: int) -> List[List[int]]:
        ans = []
        def backtrack(path, remaining, start):
            if remaining==0:
                ans.append(path[:])
                return
            if remaining < 0:
                return
            for i in range(start, len(candidates)):
                path.append(candidates[i])
                backtrack(path, remaining-candidates[i],i)
                path.pop()
        backtrack([], target, 0)
        return ans