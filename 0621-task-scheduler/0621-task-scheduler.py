class Solution:
    def leastInterval(self, tasks: List[str], n: int) -> int:
        counts = Counter(tasks)

        max_count = max(counts.values())
        max_count_tasks = sum(1 for v in counts.values() if v == max_count)
        part_count = max_count-1
        part_length = n+1
        empty_slots = part_count * part_length
        min_schedule = empty_slots + max_count_tasks
        return max(len(tasks), min_schedule)