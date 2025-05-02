class Solution(object):
    def groupAnagrams(self, strs):
        """
        :type strs: List[str]
        :rtype: List[List[str]]
        """
        adict = {}

        for word in strs:
            sorted_word = ''.join(sorted(word))
            if sorted_word not in adict:
                adict[sorted_word] = []
            adict[sorted_word].append(word)

        return list(adict.values())
        