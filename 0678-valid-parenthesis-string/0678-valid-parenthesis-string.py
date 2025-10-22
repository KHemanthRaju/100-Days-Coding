class Solution:
    def checkValidString(self, s: str) -> bool:
        leftMin = 0  # minimum possible number of open '('
        leftMax = 0  # maximum possible number of open '('

        for ch in s:
            if ch == '(':
                leftMin += 1
                leftMax += 1
            elif ch == ')':
                leftMin -= 1
                leftMax -= 1
            else:  # '*'
                leftMin -= 1   # '*' as ')'
                leftMax += 1   # '*' as '('

            if leftMax < 0:
                return False  # too many ')'

            if leftMin < 0:
                leftMin = 0   # '*' can act as '(' or empty to fix negatives

        return leftMin == 0