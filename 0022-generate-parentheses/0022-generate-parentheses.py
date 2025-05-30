class Solution:
    def generateParenthesis(self, n: int) -> List[str]:
        ans = []
        self.helper(ans, "", 0, 0, n)
        return ans
    def helper(self,ans: List[str], str1:str, open:int, close:int, n:int):
        if open == n and close == n:
            ans.append(str1)
            return
        if open < n:
            self.helper(ans, str1+"(", open+1, close, n)
        if close < open:
            self.helper(ans, str1 + ")", open, close+1, n)
        