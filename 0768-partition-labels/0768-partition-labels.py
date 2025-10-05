class Solution:
    def partitionLabels(self, s: str) -> List[int]:
        last_index = {c:i for i,c in enumerate(s)}
        start, end = 0,0 
        result =[]
        for i, c in enumerate(s):
            end = max(end, last_index[c])
            if i==end:
                result.append(end-start+1)
                start = i+1

        return result