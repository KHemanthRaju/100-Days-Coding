class Solution {
    public int lengthOfLongestSubstring(String s) {
        int longest = 0;
        int j = 0;
        Set<Character> seen = new HashSet<>();
        for(int i=0;i<s.length();i++){
            if(seen.contains(s.charAt(i))){
                seen.remove(s.charAt(j));
                j++;
            }
            seen.add(s.charAt(i));
            longest = Math.max(longest, seen.size());
        }
        return longest;
    }
}