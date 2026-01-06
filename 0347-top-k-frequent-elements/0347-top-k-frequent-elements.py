class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        dic = {}
        for num in nums:
            if num not in dic:
                dic[num]=0
            else:
                dic[num] = dic[num]+1
        heap = [(-count, num) for num, count in dic.items()]
        heapq.heapify(heap)
        ans = []
        for _ in range(k):
            count, num = heapq.heappop(heap)
            ans.append(num)
        return ans
        
        