class Solution:
    def leastInterval(self, tasks: List[str], n: int) -> int:
        counts = Counter(tasks)
        counter = 0
        lst = sorted(counts.values(), reverse = True)
        max_count = lst[0]
        i = 0
        while i < len(lst) and lst[i]==max_count:
            counter+=1
            i+=1
        ans = (max_count - 1) * (n+1) + counter
        return max(len(tasks), ans)