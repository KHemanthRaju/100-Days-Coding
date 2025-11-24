class Solution:
    def prefixesDivBy5(self, nums: List[int]) -> List[bool]:
        remainder = 0
        ans = []
        for num in nums:
            remainder = (remainder * 2 + num)%5
            ans.append(remainder == 0)
        return ans