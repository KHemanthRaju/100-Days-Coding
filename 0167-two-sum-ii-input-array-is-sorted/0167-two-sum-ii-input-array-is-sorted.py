class Solution(object):
    def twoSum(self, numbers, target):
        """
        :type numbers: List[int]
        :type target: int
        :rtype: List[int]
        """
        ans = [0,0]
        adict = {}

        for i,num in enumerate(numbers):
            if target - num in adict:
                ans[0] = adict[target - num]+1
                ans[1] = i + 1
            adict[num] = i
        return ans
        