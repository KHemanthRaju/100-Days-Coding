class Solution(object):
    def lengthOfLastWord(self, s):
        """
        :type s: str
        :rtype: int
        """
        res = s.strip(" ").split(" ")
        return len(res[-1])
