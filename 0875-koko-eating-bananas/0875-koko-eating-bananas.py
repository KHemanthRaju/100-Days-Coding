class Solution:
    def minEatingSpeed(self, piles: List[int], h: int) -> int:
        low = 1
        high = max(piles)
        results = high
        while low <= high:
            mid = (low+high)//2
            total_hours = 0
            for pile in piles:
                total_hours += math.ceil(pile/mid)
            if total_hours <= h:
                results = mid
                high = mid - 1
            else:
                low = mid + 1
        return results