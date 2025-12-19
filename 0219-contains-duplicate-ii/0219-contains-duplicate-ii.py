class Solution:
    def containsNearbyDuplicate(self, nums: List[int], k: int) -> bool:
        window_set = set()
        for i in range(len(nums)):
            if i>k:
                window_set.remove(nums[i-k-1])
            if nums[i] in window_set:
                return True
            window_set.add(nums[i])
        return False