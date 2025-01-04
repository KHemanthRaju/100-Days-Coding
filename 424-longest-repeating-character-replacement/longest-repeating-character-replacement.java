class Solution {
    public int characterReplacement(String s, int k) {
        int N = s.length();
        int[] chars = new int[26];

        int window_start = 0;
        int max_count = 0, max_length=0;

        for(int window_end = 0;window_end < s.length();window_end++){
            chars[s.charAt(window_end) - 'A']++;
            int chars_count = chars[s.charAt(window_end) - 'A'];
            max_count = Math.max(max_count, chars_count);

            while(window_end - window_start - max_count + 1 > k){
                chars[s.charAt(window_start)-'A']--;
                window_start++;
            }
            max_length = Math.max(max_length, window_end - window_start + 1);
        }

        return max_length;
    }
}