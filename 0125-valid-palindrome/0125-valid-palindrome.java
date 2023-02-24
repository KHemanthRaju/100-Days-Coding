class Solution {
    public boolean isPalindrome(String s) {
        String s1 = s.toLowerCase().trim();
        String ans = "";
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)>='a' && s1.charAt(i)<='z' || s1.charAt(i)>='0' && s1.charAt(i)<='9'){
                ans+=s1.charAt(i);
            }
        }
        StringBuilder s2 = new StringBuilder();
        s2.append(ans);
        String s3 = s2.reverse().toString();
        if(ans.equals(s3)){
            return true;
        }
        return false;
    }
}