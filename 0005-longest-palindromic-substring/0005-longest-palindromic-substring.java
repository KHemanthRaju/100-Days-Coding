class Solution {
    public String longestPalindrome(String s) {
        String ans = "";
        int maxLength = 0;
        for(int i=0;i<s.length();i++){
            String oddWord = expand(s,i,i);
            String evenWord = expand(s,i,i+1);
            if(oddWord.length()>maxLength){
                maxLength = oddWord.length();
                ans = oddWord;
            }
            if(evenWord.length() > maxLength){
                maxLength = evenWord.length();
                ans = evenWord;
            }
        }
        return ans;
    }

    public String expand(String s, int left, int right){
        while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
            left--;
            right++;
        }
        return s.substring(left+1,right);
    }
}