class Solution:
    def countMentions(
        self, numberOfUsers: int, events: List[List[str]]
    ) -> List[int]:
        events.sort(key=lambda e: (int(e[1]), e[0] == "MESSAGE"))
        count = [0] * numberOfUsers
        next_online_time = [0] * numberOfUsers
        for event in events:
            cur_time = int(event[1])
            if event[0] == "MESSAGE":
                if event[2] == "ALL":
                    for i in range(numberOfUsers):
                        count[i] += 1
                elif event[2] == "HERE":
                    for i, t in enumerate(next_online_time):
                        if t <= cur_time:
                            count[i] += 1
                else:
                    for idx in event[2].split():
                        count[int(idx[2:])] += 1
            else:
                next_online_time[int(event[2])] = cur_time + 60
        return count