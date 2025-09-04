class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        int j = 0;
        HashSet<Character> ans = new HashSet<>();
        for(int i=0;i<s.length();i++){
            while(ans.contains(s.charAt(i))){
                ans.remove(s.charAt(j));
                j++;
            }
            ans.add(s.charAt(i));
            maxLength = Math.max(maxLength, ans.size());
        }
        return maxLength;
    }
}