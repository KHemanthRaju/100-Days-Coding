class Solution:
    def twoSum(self, numbers: List[int], target: int) -> List[int]:
        maps = {}
        ans = [0,0]
        for i in range(len(numbers)):
            if target - numbers[i] in maps:
                ans[0] = maps.get(target-numbers[i])+1
                ans[1] = i + 1
            maps[numbers[i]] = i
        return ans