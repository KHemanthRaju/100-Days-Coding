class Solution:
    def findCenter(self, edges: List[List[int]]) -> int:
        degree = {}
        for edge in edges:
            degree[edge[0]] = degree.get(edge[0],0)+1
            degree[edge[1]] = degree.get(edge[1],0)+1
        for node, count in degree.items():
            if count == len(edges):
                return node
        return -1