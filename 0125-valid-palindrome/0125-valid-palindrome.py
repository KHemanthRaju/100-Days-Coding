class Solution:
    def isPalindrome(self, s: str) -> bool:
        ans = ""
        for c in s:
            if c.isalnum():
                ans += c.lower()
        return ans == ans[::-1]
        