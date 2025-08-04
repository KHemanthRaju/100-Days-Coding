class Solution:
    def combinationSum(self, candidates: List[int], target: int) -> List[List[int]]:
        res = []
        def backtrack(candidates, target, index, current, res):
            if target == 0:
                res.append(current[:])
                return
            if target < 0 or index >= len(candidates):
                return
            current.append(candidates[index])
            backtrack(candidates, target - candidates[index], index, current, res)
            current.pop()
            backtrack(candidates, target, index+1, current, res)
        backtrack(candidates, target, 0, [], res)

        return res