class Solution {
    public int lengthOfLongestSubstring(String s) {
        int longest = 0;
        int j = 0;
        Set<Character> set = new HashSet<>();
        for(int i=0;i<s.length();i++){
            while(set.contains(s.charAt(i))){
                set.remove(s.charAt(j));
                j++;
            }
            set.add(s.charAt(i));
            longest = Math.max(longest, set.size());
        }
        return longest;
    }
}