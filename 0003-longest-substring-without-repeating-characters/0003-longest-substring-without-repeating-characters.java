class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i = 0;
        int maxLength = 0;
        HashSet<Character> set = new HashSet<>();
        for(int j=0;j<s.length();j++){
            while(set.contains(s.charAt(j))){
                set.remove(s.charAt(i));
                i+=1;
            }
            set.add(s.charAt(j));
            maxLength = Math.max(maxLength, set.size());
        }
        return maxLength;
    }
}