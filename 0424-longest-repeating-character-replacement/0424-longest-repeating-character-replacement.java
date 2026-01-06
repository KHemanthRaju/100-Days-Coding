class Solution {
    public int characterReplacement(String s, int k) {
        int maxCount = 0;
        int maxLen = 0;
        int[] freq = new int[26];
        int left = 0;
        for(int right =0;right<s.length();right++){
            freq[s.charAt(right)-'A']++;
            maxLen = Math.max(maxLen, freq[s.charAt(right)-'A']);
            while((right-left+1)-maxLen>k){
                freq[s.charAt(left)-'A']--;
                left++;
            }
            maxCount = Math.max(maxCount, (right-left+1));
        }
        return maxCount;
    }
}