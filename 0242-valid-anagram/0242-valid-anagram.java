class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        int[] freq = new int[26];
        for(int i=0;i<s.length();i++){
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);
            freq[ch1-'a']++;
            freq[ch2-'a']--;
        }

        for(int i=0;i<freq.length;i++){
            if(freq[i]!=0) return false;
        }
        return true;
    }
}