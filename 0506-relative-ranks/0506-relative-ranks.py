class Solution:
    def findRelativeRanks(self, score: List[int]) -> List[str]:
        N = len(score)
        heap = []
        for index, score in enumerate(score):
            heapq.heappush(heap, (-score, index))
        rank = [0] * N
        place = 1
        while heap:
            original_index = heapq.heappop(heap)[1]
            if place == 1:
                rank[original_index] = "Gold Medal"
            elif place == 2:
                rank[original_index] = "Silver Medal"
            elif place == 3:
                rank[original_index] = "Bronze Medal"
            else:
                rank[original_index] = str(place)
            place+=1
        return rank