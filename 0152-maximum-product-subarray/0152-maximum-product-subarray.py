class Solution:
    def maxProduct(self, nums: List[int]) -> int:
        res = max(nums)
        currMin, currMax = 1,1
        for num in nums:
            if num == 0:
                currMin, currMax = 1,1
                continue
            temp = num * currMax
            currMax = max(num*currMin, num*currMax, num)
            currMin = min(num*currMin, temp, num)   
            res = max(res, currMax)
        return res