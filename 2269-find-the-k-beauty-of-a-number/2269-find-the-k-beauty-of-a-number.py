class Solution:
    def divisorSubstrings(self, num: int, k: int) -> int:
        count = 0
        window = str(num)
        if num%int(window[:k])==0:
            count+=1
        for i in range(1, len(str(num))-k+1):
            windows = window[i:i+k]
            if int(windows)!=0:
                if num%int(windows)==0:
                    count+=1
        return count