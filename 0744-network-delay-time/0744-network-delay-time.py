class Solution:
    def networkDelayTime(self, times: List[List[int]], n: int, k: int) -> int:
        heap = [(0,k)]
        graph = defaultdict(list)
        for u,v,w in times:
            graph[u].append((v,w))
        dist = {}
        while heap:
            curr_distance, curr_node = heapq.heappop(heap)
            if curr_node in dist:
                continue
            dist[curr_node] = curr_distance
            for neigh, w in graph[curr_node]:
                if neigh not in dist:
                    heapq.heappush(heap, (curr_distance+w, neigh))
        if len(dist)==n:
            return max(dist.values())
        return -1