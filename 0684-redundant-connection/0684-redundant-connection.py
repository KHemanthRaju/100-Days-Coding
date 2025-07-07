class Solution:
    def findRedundantConnection(self, edges: List[List[int]]) -> List[int]:
        parent = [i for i in range(len(edges)+1)]
        def find(x):
            while x!=parent[x]:
                parent[x] = parent[parent[x]]
                x = parent[x]
            return x
        def union(x,y):
            rootX = find(x)
            rootY = find(y)
            if rootX == rootY:
                return False
            parent[rootY] = rootX
            return True
        for u,v in edges:
            if not union(u,v):
                return [u,v]