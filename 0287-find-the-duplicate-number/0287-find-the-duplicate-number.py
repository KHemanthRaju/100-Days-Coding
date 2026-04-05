class Solution:
    def findDuplicate(self, nums: List[int]) -> int:
        # slow, fast = 0,0
        # while True:
        #     slow = nums[slow]
        #     fast = nums[nums[fast]]
        #     if fast == slow:
        #         break
        # slow2 = 0
        # while True:
        #     slow = nums[slow]
        #     slow2 = nums[slow2]
        #     if slow == slow2:
        #         return slow
        # return -1

        seen = set()
        for num in nums:
            if num in seen:
                return num
            seen.add(num)
        return -1