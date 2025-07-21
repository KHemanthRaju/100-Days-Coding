class Solution:
    def findOrder(self, numCourses: int, prerequisites: List[List[int]]) -> List[int]:
        graph = defaultdict(list)
        indegree = [0] * numCourses
        for course, pre in prerequisites:
            graph[pre].append(course)
            indegree[course]+=1

        queue = deque()
        for i in range(numCourses):
            if indegree[i]==0:
                queue.append(i)
        result = []
        index = 0
        while queue:
            ans = queue.popleft()
            result.append(ans)
            for y in graph[ans]:
                indegree[y]-=1
                if indegree[y]==0:
                    queue.append(y)
        return result if len(result) == numCourses else []