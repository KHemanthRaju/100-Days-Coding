class Solution:
    def findRedundantConnection(self, edges: List[List[int]]) -> List[int]:
        parent = list(range(len(edges)+1))
        def find(x):
            while x != parent[x]:
                parent[x] = parent[parent[x]]
                x = parent[x]
            return x

        def union(x,y):
            rootX, rootY = find(x), find(y)
            if rootX == rootY:
                return False 
            parent[rootX] = rootY
            return True

        for u,v in edges:
            if not union(u,v):
                return (u,v)
        
        return []

# // Time complexity : O(v+e)
# // Space : O(number of nodes)