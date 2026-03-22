class Solution {
    public String longestPalindrome(String s) {
        int maxLength= 0;
        String ans = "";
        for(int i=0;i<s.length();i++){
            String oddWord = expand(s, i, i);
            String evenWord = expand(s, i, i+1);
            if(oddWord.length()> maxLength){
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

    public String expand(String s, int i, int j){
        while(i>=0 && j<s.length() && s.charAt(i)==s.charAt(j)){
            i--;
            j++;
        }
        return s.substring(i+1,j);
    }
}