class Solution:
    def maxProduct(self, nums: List[int]) -> int:
        if not nums:
            return 0
        currMax,currMin = 1,1
        res = max(nums)
        for num in nums:
            if num == 0:
                currMin, currMax = 1,1
                continue
            temp = num * currMax
            currMax = max(num*currMax, num*currMin, num)
            currMin = min(num*currMin, temp, num)
            res = max(res, currMax)
        return res