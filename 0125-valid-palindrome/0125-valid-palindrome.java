class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder ans = new StringBuilder();
        for(char c:s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                ans.append(c);
            }
        }
        return ans.toString().toLowerCase().equals(ans.reverse().toString().toLowerCase());

    }
}