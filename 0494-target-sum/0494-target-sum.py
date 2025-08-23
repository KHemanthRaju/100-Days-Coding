class Solution:
    def findTargetSumWays(self, nums: List[int], target: int) -> int:
        dp = {}
        def countways(i,sum_so_far):
            if i == len(nums):
                if sum_so_far == target:
                    return 1
                else:
                    return 0
            if (i,sum_so_far) in dp:
                return dp[(i,sum_so_far)]
            plus = countways(i+1, sum_so_far+nums[i])
            minus = countways(i+1, sum_so_far-nums[i])
            dp[(i,sum_so_far)] = plus + minus
            return dp[(i,sum_so_far)]
        return countways(0,0)
        
