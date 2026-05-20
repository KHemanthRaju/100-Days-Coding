class Solution:
    def twoCitySchedCost(self, costs: List[List[int]]) -> int:
        costs.sort(key = lambda x:x[1]-x[0])

        n = len(costs) // 2
        total = 0
        for i in range(len(costs)):
            if i < n:
                total += costs[i][1]
            else:
                total += costs[i][0]
        return total