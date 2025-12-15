class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        int[] hashTableS = new int[26];
        for(int i=0;i<s.length();i++){
            hashTableS[s.charAt(i)-'a']++;
            hashTableS[t.charAt(i)-'a']--;
        }
        for(int i=0;i<hashTableS.length;i++){
            if(hashTableS[i]!=0){
                return false;
            }
        }
        return true;
    }
}