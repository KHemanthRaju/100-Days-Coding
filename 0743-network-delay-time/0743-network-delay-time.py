class Solution:
    def networkDelayTime(self, times: List[List[int]], n: int, k: int) -> int:
        heap = [(0,k)]
        graph = defaultdict(list)
        for u,v,w in times:
            graph[u].append((v,w))
        dict = {}
        while heap:
            curr_dist, curr_node = heapq.heappop(heap)
            if curr_node in dict:
                continue
            dict[curr_node] = curr_dist
            for neigh,w in graph[curr_node]:
                if neigh not in dict:
                    heapq.heappush(heap, (curr_dist+w,neigh))
        if len(dict)==n:
            return max(dict.values())
        return -1