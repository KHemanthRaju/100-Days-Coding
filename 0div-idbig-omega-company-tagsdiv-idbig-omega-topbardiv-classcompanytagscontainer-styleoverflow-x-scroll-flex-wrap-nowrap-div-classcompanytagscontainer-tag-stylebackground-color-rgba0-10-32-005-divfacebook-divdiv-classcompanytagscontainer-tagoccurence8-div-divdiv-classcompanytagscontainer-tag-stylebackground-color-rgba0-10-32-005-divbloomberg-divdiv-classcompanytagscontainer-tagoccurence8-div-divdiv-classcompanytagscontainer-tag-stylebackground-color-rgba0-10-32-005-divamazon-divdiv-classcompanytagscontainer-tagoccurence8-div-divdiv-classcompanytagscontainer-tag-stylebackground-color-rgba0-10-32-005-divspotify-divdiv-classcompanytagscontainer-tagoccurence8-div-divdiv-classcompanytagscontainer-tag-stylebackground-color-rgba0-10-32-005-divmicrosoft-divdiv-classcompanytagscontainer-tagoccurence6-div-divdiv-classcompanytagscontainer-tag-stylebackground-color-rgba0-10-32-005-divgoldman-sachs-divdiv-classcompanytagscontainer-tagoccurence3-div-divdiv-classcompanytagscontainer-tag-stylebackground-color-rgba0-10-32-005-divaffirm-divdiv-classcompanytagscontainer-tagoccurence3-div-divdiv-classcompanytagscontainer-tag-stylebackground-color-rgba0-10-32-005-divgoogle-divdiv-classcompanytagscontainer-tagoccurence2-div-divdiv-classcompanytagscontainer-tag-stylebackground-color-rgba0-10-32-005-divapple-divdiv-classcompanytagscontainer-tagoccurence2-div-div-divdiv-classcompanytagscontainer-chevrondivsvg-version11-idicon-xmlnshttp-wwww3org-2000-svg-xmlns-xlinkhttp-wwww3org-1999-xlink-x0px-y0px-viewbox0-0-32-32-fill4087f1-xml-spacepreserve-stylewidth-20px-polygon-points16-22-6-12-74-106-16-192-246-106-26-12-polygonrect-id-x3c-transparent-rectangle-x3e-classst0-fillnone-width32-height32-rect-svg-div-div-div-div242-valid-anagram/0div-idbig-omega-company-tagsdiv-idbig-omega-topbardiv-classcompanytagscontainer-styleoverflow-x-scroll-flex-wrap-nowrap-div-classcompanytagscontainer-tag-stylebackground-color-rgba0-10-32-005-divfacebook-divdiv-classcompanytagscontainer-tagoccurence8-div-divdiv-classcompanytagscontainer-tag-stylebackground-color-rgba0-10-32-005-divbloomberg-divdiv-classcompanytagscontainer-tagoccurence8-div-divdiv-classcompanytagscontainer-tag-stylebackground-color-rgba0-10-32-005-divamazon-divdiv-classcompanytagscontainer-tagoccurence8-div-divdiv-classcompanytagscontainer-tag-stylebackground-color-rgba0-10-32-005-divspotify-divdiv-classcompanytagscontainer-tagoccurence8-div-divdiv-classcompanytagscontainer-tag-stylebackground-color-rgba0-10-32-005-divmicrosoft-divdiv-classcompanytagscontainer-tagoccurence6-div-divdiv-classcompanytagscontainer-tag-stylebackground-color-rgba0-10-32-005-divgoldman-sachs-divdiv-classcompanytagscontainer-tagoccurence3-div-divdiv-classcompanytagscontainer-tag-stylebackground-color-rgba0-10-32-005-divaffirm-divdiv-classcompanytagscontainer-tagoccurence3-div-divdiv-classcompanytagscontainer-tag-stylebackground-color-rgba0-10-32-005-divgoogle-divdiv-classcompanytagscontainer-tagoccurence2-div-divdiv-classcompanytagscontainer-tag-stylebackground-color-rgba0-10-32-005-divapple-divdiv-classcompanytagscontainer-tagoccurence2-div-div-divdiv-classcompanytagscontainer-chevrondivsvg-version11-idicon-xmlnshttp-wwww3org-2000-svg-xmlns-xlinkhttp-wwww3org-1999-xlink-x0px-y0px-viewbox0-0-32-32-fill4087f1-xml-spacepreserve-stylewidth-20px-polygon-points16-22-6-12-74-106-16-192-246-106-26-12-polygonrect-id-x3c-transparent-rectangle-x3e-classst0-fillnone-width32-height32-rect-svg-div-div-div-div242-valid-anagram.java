class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        
        char[] str1 = s.toCharArray();
        char[] str2 = t.toCharArray();
        Arrays.sort(str1);
        Arrays.sort(str2);
        
        for(int i=0,j=0;i<s.length();i++,j++){
            if(str1[i]!=str2[j]){
                return false;
            }
        }
        
        return true;
    }
}