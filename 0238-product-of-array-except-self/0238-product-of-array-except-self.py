class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        n = len(nums)
        pref = [0] * n
        suf = [0] * n
        res = [0] * n
        pref[0] = suf[n-1] = 1
        for i in range(1,n):
            pref[i] = nums[i-1] * pref[i-1]
        for i in range(n-2,-1,-1):
            suf[i] = suf[i+1] * nums[i+1]
        for i in range(n):
            res[i] = suf[i] * pref[i]
        return res
