class Solution {
    public boolean closeStrings(String word1, String word2) {
        if(word1.length()!=word2.length()){
            return false;
        }
        int[] char1 = new int[26];
        int[] char2 = new int[26];
        
        for(char ch:word1.toCharArray()){
            char1[ch-'a']++;
        }
        
        for(char ch:word2.toCharArray()){
            char2[ch-'a']++;
        }
        
        for(int i=0;i<26;i++){
            if(char1[i]==char2[i]){
                continue;
            }
            if(char1[i]==0||char2[i]==0){
                return false;
            }
        }
        
        Arrays.sort(char1);
        Arrays.sort(char2);
        for(int i=0;i<26;i++){
            if(char1[i]!=char2[i]){
                return false;
            }
        }
        return true;
        
    }
}