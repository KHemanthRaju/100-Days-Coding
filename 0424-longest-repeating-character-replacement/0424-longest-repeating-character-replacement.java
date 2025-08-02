class Solution {
    public int characterReplacement(String s, int k) {
        int window_start = 0;
        int[] ch  = new int[26];
        int maxLength = 0;
        int maxCount = 0;
        for(int window_end = 0;window_end<s.length();window_end++){
            ch[s.charAt(window_end)-'A']++;
            int chars_count = ch[s.charAt(window_end)-'A']; 
            maxCount = Math.max(maxCount, chars_count);
            if(window_end - window_start - maxCount + 1 > k){
                ch[s.charAt(window_start)-'A']--;
                window_start++;
            }
            maxLength = Math.max(maxLength, window_end - window_start + 1);
        }
        return maxLength;
    }
}