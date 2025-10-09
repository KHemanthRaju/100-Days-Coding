class Solution(object):
    def maximumElementAfterDecrementingAndRearranging(self, arr):
        """
        :type arr: List[int]
        :rtype: int
        """
        arr.sort()
        prev= 1
        max_val = 1
        for i in range(1, len(arr)):
            cur = min(prev+1, arr[i])
            prev= cur
            if cur > max_val:
                max_val = cur
        return max_val
        