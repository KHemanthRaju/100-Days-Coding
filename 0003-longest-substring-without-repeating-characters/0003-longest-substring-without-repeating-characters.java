class Solution {
    public int lengthOfLongestSubstring(String s) {
        int longest = 0;
        int startWindow = 0;
        Set<Character> seen = new HashSet<>();
        for(int endWindow = 0;endWindow<s.length();endWindow++){
            while(seen.contains(s.charAt(endWindow))){
                seen.remove(s.charAt(startWindow));
                startWindow++;
            }
            seen.add(s.charAt(endWindow));
            longest = Math.max(longest, endWindow - startWindow + 1);
        }
        return longest;
    }
}