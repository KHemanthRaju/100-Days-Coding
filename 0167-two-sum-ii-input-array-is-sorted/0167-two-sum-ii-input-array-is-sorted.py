class Solution:
    def twoSum(self, numbers: List[int], target: int) -> List[int]:
        dict = {}
        for i,n in enumerate(numbers):
            if target-n in dict:
                return [dict[target-n]+1,i+1]
            dict[n]=i
        