class Solution:
    def findKthPositive(self, arr: List[int], k: int) -> int:
        maxNumber = max(arr)
        res = []
        for i in range(1,maxNumber+k+1):
            if i not in arr:
                res.append(i)
        for i in range(len(res)):
            print(res[i])
            if i==k-1:
                return res[i]
        return -1