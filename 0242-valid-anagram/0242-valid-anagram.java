class Solution {
    public boolean isAnagram(String s, String t) {
        int[] ans = new int[26];
        if(s.length() != t.length()){
            return false;
        }
        for(int i=0;i<s.length();i++){
            ans[s.charAt(i)-'a']++;
            ans[t.charAt(i)-'a']--;
        }
        for(int i=0;i<ans.length;i++){
            if(ans[i]!=0){
                return false;
            }
        }
        return true;
    }
}