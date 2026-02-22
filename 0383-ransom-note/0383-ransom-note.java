class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.length() > magazine.length()) return false;
        int[] alpha_count = new int[26];
        for(int i=0;i<magazine.length();i++){
            alpha_count[magazine.charAt(i)-'a']++;
        }
        for(int i=0;i<ransomNote.length();i++){
            if(alpha_count[ransomNote.charAt(i)-'a']==0) return false;
            alpha_count[ransomNote.charAt(i)-'a']--;
        }
        return true;
    }
}