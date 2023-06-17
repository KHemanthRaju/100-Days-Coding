class Solution {
    public int longestPalindrome(String s) {
        HashSet<Character> set = new HashSet();
        int len = 0;
        for(char c:s.toCharArray()){
            if(set.contains(c)){
                len+=2;
                set.remove(c);
            }
            else set.add(c);
        }
        return set.size()>0?len+1:len;
    }
}