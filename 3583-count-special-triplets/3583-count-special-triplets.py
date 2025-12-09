class Solution:
    def specialTriplets(self, nums: List[int]) -> int:
        MOD = 10**9+7
        max_val = max(nums)*2
        freqPrev = [0] * (max_val+1)
        freqNext = [0] * (max_val+1)
        for x in nums:
            freqNext[x] += 1
        ans = 0
        for x in nums:
            freqNext[x] -= 1
            t = x * 2
            ans = (ans + freqPrev[t] * freqNext[t]) % MOD
            freqPrev[x] += 1
        return ans