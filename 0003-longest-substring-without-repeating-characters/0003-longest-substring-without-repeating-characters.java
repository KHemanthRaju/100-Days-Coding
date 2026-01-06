class Solution {
    public int lengthOfLongestSubstring(String s) {
        int startWindow = 0;
        int longest = 0;
        HashSet<Character> seen = new HashSet<>();
        for(int endWindow=0;endWindow<s.length();endWindow++){
            while(seen.contains(s.charAt(endWindow))){
                seen.remove(s.charAt(startWindow));
                startWindow++;
            }
            seen.add(s.charAt(endWindow));
            longest = Math.max(longest, endWindow-startWindow+1);
        }
        return longest;
    }
}