class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length()==0){
            return true;
        }
        int j=0;
        for(int i=0;i<t.length();i++){
            if(s.length()>j && s.charAt(j)==t.charAt(i)){
                j++;
            }
        }
        if(j==s.length()){
            return true;
        }
        return false;
    }
}