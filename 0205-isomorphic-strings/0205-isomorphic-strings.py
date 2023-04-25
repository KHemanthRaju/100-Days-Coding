class Solution(object):
    def isIsomorphic(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        map1 =[]
        map2 =[]
        for idx1 in s:
            map1.append(s.index(idx1))
        for idx2 in t:
            map2.append(t.index(idx2))
        if(map1==map2):
            return True
        return False
        