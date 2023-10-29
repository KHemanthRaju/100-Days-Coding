class Solution:
    def findPeakElement(self, nums: List[int]) -> int:
        low = 0;
        high = len(nums)-1;
        while low<(high-1):
            mid = low+(high-low)//2
            if(nums[mid]>nums[mid+1] and nums[mid]>nums[mid-1]):
                return mid;
            if(nums[mid]>nums[mid+1]):
                high = mid - 1;
            else:
                low = mid+1;
        return low if nums[low]>=nums[high] else high;