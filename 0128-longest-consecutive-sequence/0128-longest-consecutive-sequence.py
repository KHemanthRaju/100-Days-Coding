class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        hset = set()

        for i in nums:
            hset.add(i)
        
        longest = 0

        for i in hset:
            if i-1 not in hset:

                length = 1

                while i+length in hset:
                    length+=1

                longest = max(longest,length)

        return longest