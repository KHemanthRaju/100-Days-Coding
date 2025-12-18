class Solution:
    def findKthPositive(self, arr: List[int], k: int) -> int:
        left, right = 0, len(arr)-1
        while left<=right:
            mid = (left+right)//2
            if arr[mid] - (mid+1) >=k:
                right = mid - 1
            else:
                left = mid + 1
        return left+k