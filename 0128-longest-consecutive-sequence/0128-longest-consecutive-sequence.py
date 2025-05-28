class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        sets = set()
        for num in nums:
            sets.add(num)
        longest = 0
        for num in sets:
            if num-1 not in sets:
                length = 1
                while num+length in sets:
                    length += 1
                longest = max(longest, length)
        return longest